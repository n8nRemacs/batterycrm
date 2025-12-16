package com.avito.android.multi_message_send.domain;

import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.HashSet;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CheckMessageHasQuestionUseCaseImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/multi_message_send/domain/b;", "Lcom/avito/android/multi_message_send/domain/a;", "<init>", "()V", "a", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.multi_message_send.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final HashSet<String> f206683a;

    /* compiled from: CheckMessageHasQuestionUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/multi_message_send/domain/b$a;", "", "<init>", "()V", "", "QUESTION_MARK_SYMBOL", "Ljava/lang/String;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "questionWords", "Ljava/util/HashSet;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f206683a = b1.c("кто", "кого", "кому", "кем", "о ком", "что", "чего", "чему", "чем", "какой", "какая", "какое", "какие", "какого", "каких", "какому", "каким", "какую", "какое", "какими", "который", "которая", "которое", "которые", "которого", "которой", "которых", "которому", "которым", "которую", "о котором", "которыми", "чей", "чья", "чьё", "чьи", "чьего", "чьей", "чьих", "чьему", "чьим", "чью", "чьё", "чьи", "чьими", "о чьём", "сколько", "скольки", "каков", "какова", "каково", "каковы", "какового", "каковой", "какового", "каковых", "каковому", "каковым", "какову", "каково", "каковым", "каковыми", "о каковом", "как", "где", "когда", "почему", "куда", "зачем", "откуда", "отчего", "каким", "какого", "на что", "за что", "для чего", "чему", "причём здесь", "кем");
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.multi_message_send.domain.a
    public final boolean a(@Y61.k String str) {
        String string = C43066x.A0(str).toString();
        if (C43066x.K(string) || string.equals("?")) {
            return false;
        }
        if (!C43066x.q(string, "?", false)) {
            HashSet<String> hashSet = f206683a;
            if (hashSet != null && hashSet.isEmpty()) {
                return false;
            }
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                if (C43066x.q(string, it.next(), true)) {
                }
            }
            return false;
        }
        return true;
    }
}

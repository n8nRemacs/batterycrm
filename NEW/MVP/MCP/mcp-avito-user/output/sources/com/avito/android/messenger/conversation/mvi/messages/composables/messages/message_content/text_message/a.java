package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message;

import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OnlyEmojiMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f192568a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f192569b = new C22096n(776388384, C5686a.f192570l, false);

    /* compiled from: OnlyEmojiMessageContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message.a$a, reason: collision with other inner class name */
    public static final class C5686a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5686a f192570l = new C5686a();

        public C5686a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.avito.android.messenger.conversation.mvi.messages.utils.a.f193555a.getClass();
                C22602e.b bVar = new C22602e.b(0, 1, null);
                bVar.f("😁");
                c.a(bVar.m(), null, false, a13, 0, 6);
            }
            return G0.f406611a;
        }
    }
}

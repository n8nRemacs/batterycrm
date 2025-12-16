package com.avito.android.messenger.conversation.uxf;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.C22977J;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;

/* compiled from: ChannelFeedbackHelper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/uxf/a;", "", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC31987a f195253a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SK0.b f195254b;

    /* compiled from: ChannelFeedbackHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/uxf/a$a;", "", "<init>", "()V", "", "PRICE_UXF_KEY", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.uxf.a$a, reason: collision with other inner class name */
    public static final class C5766a {
        public /* synthetic */ C5766a(C42822w c42822w) {
            this();
        }

        public C5766a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelFeedbackHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/uxf/a$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f195255b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f195256c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f195257d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f195258e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f195259f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f195260g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ b[] f195261h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f195262i;

        static {
            b bVar = new b("REALTY", 0);
            f195255b = bVar;
            b bVar2 = new b("AUTO", 1);
            f195256c = bVar2;
            b bVar3 = new b("GENERAL", 2);
            f195257d = bVar3;
            b bVar4 = new b("JOB", 3);
            f195258e = bVar4;
            b bVar5 = new b("SERVICES", 4);
            f195259f = bVar5;
            b bVar6 = new b("ALL", 5);
            f195260g = bVar6;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
            f195261h = bVarArr;
            f195262i = kotlin.enums.c.a(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f195261h.clone();
        }
    }

    /* compiled from: ChannelFeedbackHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b bVar = b.f195255b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b bVar2 = b.f195255b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b bVar3 = b.f195255b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b bVar4 = b.f195255b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b bVar5 = b.f195255b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        new C5766a(null);
    }

    @Inject
    public a(@k InterfaceC31987a interfaceC31987a, @k SK0.b bVar) {
        this.f195253a = interfaceC31987a;
        this.f195254b = bVar;
    }

    public final void a(@k C22977J c22977j) {
        C43259k.d(c22977j, null, null, new com.avito.android.messenger.conversation.uxf.b(this, null), 3);
    }
}

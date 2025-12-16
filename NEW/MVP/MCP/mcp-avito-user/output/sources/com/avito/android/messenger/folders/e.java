package com.avito.android.messenger.folders;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.persistence.messenger.C33126v0;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.N;

/* compiled from: Folder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/folders/e;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f196349a = new e();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final com.avito.android.messenger.folders.a f196350b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final com.avito.android.messenger.folders.a f196351c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final com.avito.android.messenger.folders.a f196352d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f196353e;

    /* compiled from: Folder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/avito/android/messenger/folders/a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<List<? extends com.avito.android.messenger.folders.a>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f196354l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends com.avito.android.messenger.folders.a> invoke() {
            e.f196349a.getClass();
            return C42745f0.U(e.f196351c, e.f196352d);
        }
    }

    static {
        b1.m(new String[0]);
        b1.m("s");
        b1.m("s");
        b1.m(new String[0]);
        b1.m(new String[0]);
        b1.m(new String[0]);
        f196350b = new com.avito.android.messenger.folders.a("", 0, new C33126v0(b1.m(new String[0]), b1.m("s", "p")), new C33126v0(b1.m("s", "p"), b1.m(new String[0])), new C33126v0(b1.m(new String[0]), b1.m(new String[0])));
        f196351c = new com.avito.android.messenger.folders.a("inbox", R.string.messenger_folder_unsorted, new C33126v0(b1.m("f_i"), b1.m("s")), new C33126v0(b1.m("s"), b1.m(new String[0])), new C33126v0(b1.m("f_i", "s"), b1.m(new String[0])));
        f196352d = new com.avito.android.messenger.folders.a("bargainAndExchange", R.string.messenger_folder_bargaining_and_exchange, new C33126v0(b1.m("f_b", "f_e"), b1.m(new String[0])), null, new C33126v0(b1.m("f_b", "f_e"), b1.m(new String[0])));
        f196353e = C42727D.c(a.f196354l);
    }

    @k
    public static com.avito.android.messenger.folders.a a() {
        return f196352d;
    }
}

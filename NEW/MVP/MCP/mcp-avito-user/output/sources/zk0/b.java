package ZK0;

import SK0.b;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BbipUxFeedbackHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZK0/b;", "LZK0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements ZK0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f20109a;

    /* compiled from: BbipUxFeedbackHelper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ZK0/b$a", "LSK0/c;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SK0.c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20110a;

        public a(String str) {
            this.f20110a = str;
        }

        @Override // SK0.c
        @k
        /* renamed from: a, reason: from getter */
        public final String getF20110a() {
            return this.f20110a;
        }
    }

    @Inject
    public b(@k SK0.b bVar) {
        this.f20109a = bVar;
    }

    @Override // ZK0.a
    public final void a(@l String str) {
        if (str != null) {
            b.a.a(this.f20109a, new a(str), null, null, null, 14);
        }
    }
}

package wZ;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MnzColor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LwZ/e;", "", "a", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wZ.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C49581e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f441553b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f441554a;

    /* compiled from: MnzColor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwZ/e$a;", "", "<init>", "()V", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wZ.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49581e(@InterfaceC42156l int i12) {
        this.f441554a = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49581e) && this.f441554a == ((C49581e) obj).f441554a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f441554a);
    }

    @Y61.k
    public final String toString() {
        return r.t(new StringBuilder("MnzColor(value="), this.f441554a, ')');
    }
}

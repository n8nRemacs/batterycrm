package dO;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.installments_block.entity.InstallmentsBlock;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsBlockInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LdO/b;", "", "a", "b", "c", "LdO/b$a;", "LdO/b$b;", "LdO/b$c;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dO.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC39606b {

    /* compiled from: InstallmentsBlockInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdO/b$a;", "LdO/b;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dO.b$a */
    public static final /* data */ class a implements InterfaceC39606b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f393840a;

        public a(@k DeepLink deepLink) {
            this.f393840a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f393840a, ((a) obj).f393840a);
        }

        public final int hashCode() {
            return this.f393840a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f393840a, ')');
        }
    }

    /* compiled from: InstallmentsBlockInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdO/b$b;", "LdO/b;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dO.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11026b implements InterfaceC39606b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f393841a;

        public C11026b(@k String str) {
            this.f393841a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11026b) && L.f(this.f393841a, ((C11026b) obj).f393841a);
        }

        public final int hashCode() {
            return this.f393841a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectBlockState(selectedPlanId="), this.f393841a, ')');
        }
    }

    /* compiled from: InstallmentsBlockInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdO/b$c;", "LdO/b;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dO.b$c */
    public static final /* data */ class c implements InterfaceC39606b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InstallmentsBlock f393842a;

        public c(@k InstallmentsBlock installmentsBlock) {
            this.f393842a = installmentsBlock;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f393842a, ((c) obj).f393842a);
        }

        public final int hashCode() {
            return this.f393842a.hashCode();
        }

        @k
        public final String toString() {
            return "SetContent(installmentsBlock=" + this.f393842a + ')';
        }
    }
}

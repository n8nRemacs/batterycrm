package androidx.compose.foundation.content;

import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.foundation.W0;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.L0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TransferableContent.kt */
@W0
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/content/g;", "", "Landroidx/compose/ui/platform/K0;", "clipEntry", "Landroidx/compose/ui/platform/L0;", "clipMetadata", "Landroidx/compose/foundation/content/g$a;", SearchParamsConverterKt.SOURCE, "Landroidx/compose/foundation/content/b;", "platformTransferableContent", "<init>", "(Landroidx/compose/ui/platform/K0;Landroidx/compose/ui/platform/L0;ILandroidx/compose/foundation/content/b;Lkotlin/jvm/internal/w;)V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* compiled from: TransferableContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/content/g$a;", "", "a", "value", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @W0
    @X41.g
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C1562a f26980b = new C1562a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f26981c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f26982d = 2;

        /* renamed from: a, reason: collision with root package name */
        public final int f26983a;

        /* compiled from: TransferableContent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/content/g$a$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.content.g$a$a, reason: collision with other inner class name */
        public static final class C1562a {
            public /* synthetic */ C1562a(C42822w c42822w) {
                this();
            }

            public C1562a() {
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f26983a == ((a) obj).f26983a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f26983a);
        }

        @k
        public final String toString() {
            int i12 = this.f26983a;
            return i12 == 0 ? "Source.Keyboard" : i12 == f26981c ? "Source.DragAndDrop" : i12 == f26982d ? "Source.Clipboard" : r.p("Invalid (", i12, ')');
        }
    }

    public g(K0 k02, L0 l02, int i12, b bVar, C42822w c42822w) {
    }

    public /* synthetic */ g(K0 k02, L0 l02, int i12, b bVar, int i13, C42822w c42822w) {
        this(k02, l02, i12, (i13 & 8) != 0 ? null : bVar, null);
    }
}

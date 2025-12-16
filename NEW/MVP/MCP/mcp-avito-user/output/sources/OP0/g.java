package op0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BbipScreenItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lop0/g;", "", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public ArrayList f420209a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public a f420210b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public a f420211c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public a f420212d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public C44840b f420213e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public MnzFloatingFooter f420214f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public String f420215g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public String f420216h;

    public g() {
        throw null;
    }

    /* compiled from: BbipScreenItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lop0/g$a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f420217a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f420218b;

        public a(@l DeepLink deepLink, @l PrintableText printableText) {
            this.f420217a = printableText;
            this.f420218b = deepLink;
        }

        public /* synthetic */ a(PrintableText printableText, DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : deepLink, printableText);
        }
    }
}

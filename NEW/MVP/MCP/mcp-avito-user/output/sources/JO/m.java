package JO;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: SelectableItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJO/m;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class m implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f8961b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f8962c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f8963d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8964e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f8965f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final DeepLink f8966g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f8967h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8968i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f8969j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final DeepLink f8970k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8971l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final List<SelectParameter.Value.Paragraph> f8972m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final SelectParameter.Value.LinkButton f8973n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f8974o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f8975p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final SelectParameter.Displaying.LabelPosition f8976q;

    public m(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, boolean z12, @Y61.l Integer num, @Y61.l DeepLink deepLink, @Y61.l String str4, boolean z13, @Y61.l UniversalImage universalImage, @Y61.l DeepLink deepLink2, boolean z14, @Y61.l List<SelectParameter.Value.Paragraph> list, @Y61.l SelectParameter.Value.LinkButton linkButton, @Y61.l String str5, @Y61.l String str6, @Y61.l SelectParameter.Displaying.LabelPosition labelPosition) {
        this.f8961b = str;
        this.f8962c = str2;
        this.f8963d = str3;
        this.f8964e = z12;
        this.f8965f = num;
        this.f8966g = deepLink;
        this.f8967h = str4;
        this.f8968i = z13;
        this.f8969j = universalImage;
        this.f8970k = deepLink2;
        this.f8971l = z14;
        this.f8972m = list;
        this.f8973n = linkButton;
        this.f8974o = str5;
        this.f8975p = str6;
        this.f8976q = labelPosition;
    }

    public static m a(m mVar, boolean z12) {
        String str = mVar.f8961b;
        String str2 = mVar.f8962c;
        String str3 = mVar.f8963d;
        Integer num = mVar.f8965f;
        DeepLink deepLink = mVar.f8966g;
        String str4 = mVar.f8967h;
        boolean z13 = mVar.f8968i;
        UniversalImage universalImage = mVar.f8969j;
        DeepLink deepLink2 = mVar.f8970k;
        boolean z14 = mVar.f8971l;
        List<SelectParameter.Value.Paragraph> list = mVar.f8972m;
        SelectParameter.Value.LinkButton linkButton = mVar.f8973n;
        String str5 = mVar.f8974o;
        String str6 = mVar.f8975p;
        SelectParameter.Displaying.LabelPosition labelPosition = mVar.f8976q;
        mVar.getClass();
        return new m(str, str2, str3, z12, num, deepLink, str4, z13, universalImage, deepLink2, z14, list, linkButton, str5, str6, labelPosition);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f8961b, mVar.f8961b) && this.f8964e == mVar.f8964e && this.f8968i == mVar.f8968i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return getF229914b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229914b() {
        return this.f8961b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8968i) + r.i(this.f8961b.hashCode() * 31, 31, this.f8964e);
    }

    @Y61.k
    public final String toString() {
        return "SelectableItem(stringId=" + this.f8961b + ", title=" + this.f8962c + ", subtitle=" + this.f8963d + ", isSelected=" + this.f8964e + ", color=" + this.f8965f + ", hintAction=" + this.f8966g + ", icon=" + this.f8967h + ", isDisable=" + this.f8968i + ", image=" + this.f8969j + ", link=" + this.f8970k + ", isError=" + this.f8971l + ", paragraphs=" + this.f8972m + ", linkButton=" + this.f8973n + ", description=" + this.f8974o + ", subheading=" + this.f8975p + ", labelPosition=" + this.f8976q + ')';
    }

    public /* synthetic */ m(String str, String str2, String str3, boolean z12, Integer num, DeepLink deepLink, String str4, boolean z13, UniversalImage universalImage, DeepLink deepLink2, boolean z14, List list, SelectParameter.Value.LinkButton linkButton, String str5, String str6, SelectParameter.Displaying.LabelPosition labelPosition, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, z12, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : deepLink, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? false : z13, (i12 & 256) != 0 ? null : universalImage, (i12 & 512) != 0 ? null : deepLink2, (i12 & 1024) != 0 ? false : z14, (i12 & 2048) != 0 ? null : list, (i12 & 4096) != 0 ? null : linkButton, (i12 & 8192) != 0 ? null : str5, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str6, (i12 & 32768) != 0 ? null : labelPosition);
    }
}

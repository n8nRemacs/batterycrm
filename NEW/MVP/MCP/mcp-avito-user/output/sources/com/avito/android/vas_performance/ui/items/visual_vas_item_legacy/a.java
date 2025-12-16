package com.avito.android.vas_performance.ui.items.visual_vas_item_legacy;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: VisualVasItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/visual_vas_item_legacy/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f321816b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f321817c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f321818d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f321819e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f321820f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Image f321821g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f321822h;

    /* renamed from: i, reason: collision with root package name */
    public final long f321823i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f321824j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final UniversalImage f321825k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final AttributedText f321826l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Float f321827m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Integer f321828n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final AttributedText f321829o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final String f321830p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final UniversalColor f321831q;

    public a(@k String str, @k String str2, @k AttributedText attributedText, @k AttributedText attributedText2, @l AttributedText attributedText3, @l Image image, @k String str3, long j12, boolean z12, @l UniversalImage universalImage, @l AttributedText attributedText4, @l Float f12, @l Integer num, @l AttributedText attributedText5, @l String str4, @l UniversalColor universalColor) {
        this.f321816b = str;
        this.f321817c = str2;
        this.f321818d = attributedText;
        this.f321819e = attributedText2;
        this.f321820f = attributedText3;
        this.f321821g = image;
        this.f321822h = str3;
        this.f321823i = j12;
        this.f321824j = z12;
        this.f321825k = universalImage;
        this.f321826l = attributedText4;
        this.f321827m = f12;
        this.f321828n = num;
        this.f321829o = attributedText5;
        this.f321830p = str4;
        this.f321831q = universalColor;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return getF320665b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF320665b() {
        return this.f321816b;
    }

    public /* synthetic */ a(String str, String str2, AttributedText attributedText, AttributedText attributedText2, AttributedText attributedText3, Image image, String str3, long j12, boolean z12, UniversalImage universalImage, AttributedText attributedText4, Float f12, Integer num, AttributedText attributedText5, String str4, UniversalColor universalColor, int i12, C42822w c42822w) {
        this(str, str2, attributedText, attributedText2, attributedText3, image, str3, j12, z12, universalImage, attributedText4, f12, num, (i12 & 8192) != 0 ? null : attributedText5, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str4, (i12 & 32768) != 0 ? null : universalColor);
    }
}

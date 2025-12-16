package com.avito.android.advert_core.feature_teasers.common.dialog;

import com.avito.android.advert_core.feature_teasers.common.AdvertDetailsFeatureTeaserItem;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsFeatureTeaserDialogTextItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/dialog/e;", "Lcom/avito/conveyor_item/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f83624b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f83625c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f83626d;

    /* renamed from: e, reason: collision with root package name */
    public final int f83627e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f83628f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFeatureTeaserItem.Icon f83629g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFeatureTeaserItem.Icon f83630h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f83631i;

    /* renamed from: j, reason: collision with root package name */
    public final int f83632j;

    public e(long j12, String str, AttributedText attributedText, int i12, String str2, AdvertDetailsFeatureTeaserItem.Icon icon, AdvertDetailsFeatureTeaserItem.Icon icon2, Integer num, int i13, int i14, C42822w c42822w) {
        str = (i14 & 2) != 0 ? null : str;
        attributedText = (i14 & 4) != 0 ? null : attributedText;
        str2 = (i14 & 16) != 0 ? String.valueOf(j12) : str2;
        icon = (i14 & 32) != 0 ? null : icon;
        icon2 = (i14 & 64) != 0 ? null : icon2;
        num = (i14 & 128) != 0 ? null : num;
        i13 = (i14 & 256) != 0 ? 0 : i13;
        this.f83624b = j12;
        this.f83625c = str;
        this.f83626d = attributedText;
        this.f83627e = i12;
        this.f83628f = str2;
        this.f83629g = icon;
        this.f83630h = icon2;
        this.f83631i = num;
        this.f83632j = i13;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80596b() {
        return this.f83624b;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF299239b() {
        return this.f83628f;
    }
}

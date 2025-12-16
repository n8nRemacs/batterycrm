package com.avito.android.extended_profile_ui_components;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: BadgeBarV3View.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/i;", "Lcom/facebook/imagepipeline/datasource/c;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.facebook.imagepipeline.datasource.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f153344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f153345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.f f153346c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f153347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BadgeBarV3View f153348e;

    public i(ArrayList arrayList, int i12, l0.f fVar, List list, BadgeBarV3View badgeBarV3View) {
        this.f153344a = arrayList;
        this.f153345b = i12;
        this.f153346c = fVar;
        this.f153347d = list;
        this.f153348e = badgeBarV3View;
    }

    @Override // com.facebook.datasource.e
    public final void a(@Y61.k com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> fVar) {
        ArrayList arrayList = this.f153344a;
        l0.f fVar2 = this.f153346c;
        List<Uri> list = this.f153347d;
        BadgeBarV3View badgeBarV3View = this.f153348e;
        synchronized (arrayList) {
            try {
                int i12 = fVar2.f406840b + 1;
                fVar2.f406840b = i12;
                if (i12 == list.size()) {
                    badgeBarV3View.post(new h(badgeBarV3View, arrayList, 0));
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.imagepipeline.datasource.c
    public final void g(@Y61.l Bitmap bitmap) {
        if (bitmap != null) {
            ArrayList arrayList = this.f153344a;
            int i12 = this.f153345b;
            l0.f fVar = this.f153346c;
            List<Uri> list = this.f153347d;
            BadgeBarV3View badgeBarV3View = this.f153348e;
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            synchronized (arrayList) {
                try {
                    arrayList.set(i12, bitmapCopy);
                    int i13 = fVar.f406840b + 1;
                    fVar.f406840b = i13;
                    if (i13 == list.size()) {
                        badgeBarV3View.post(new h(badgeBarV3View, arrayList, 1));
                    }
                    G0 g02 = G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}

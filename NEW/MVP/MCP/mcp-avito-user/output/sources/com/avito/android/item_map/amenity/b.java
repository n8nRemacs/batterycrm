package com.avito.android.item_map.amenity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AmenityButtonView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/amenity/b;", "Lcom/avito/android/item_map/amenity/a;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.item_map.amenity.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f173282a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ProgressBar f173283b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f173284c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f173285d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f173286e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public AmenityButton f173287f;

    /* compiled from: AmenityButtonView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ButtonViewState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ButtonViewState buttonViewState = ButtonViewState.f173277b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ButtonViewState buttonViewState2 = ButtonViewState.f173277b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(@Y61.k View view) {
        this.f173282a = view.findViewById(R.id.container);
        this.f173283b = (ProgressBar) view.findViewById(R.id.progress);
        this.f173284c = view.findViewById(R.id.image_bg);
        this.f173285d = (ImageView) view.findViewById(R.id.image);
        this.f173286e = (TextView) view.findViewById(R.id.text);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    @Override // com.avito.android.item_map.amenity.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.avito.android.item_map.amenity.ButtonViewState r9) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.item_map.amenity.b.a(com.avito.android.item_map.amenity.ButtonViewState):void");
    }

    @Override // com.avito.android.item_map.amenity.a
    public final void b(boolean z12) {
        ImageView imageView = this.f173285d;
        ProgressBar progressBar = this.f173283b;
        if (z12) {
            progressBar.setVisibility(0);
            imageView.setVisibility(8);
        } else {
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
        }
    }
}

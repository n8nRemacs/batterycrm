package com.avito.android.barcode.presentation;

import Og.InterfaceC14684a;
import Qg.C14892a;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.barcode.presentation.BarcodeDetailsActivity;
import com.avito.android.barcode_encoder.BarcodeFormat;
import com.avito.android.barcode_encoder.EncodeHintType;
import com.avito.android.util.L0;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.Map;
import kotlin.C42833p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BarcodeDetailsActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BarcodeFormat f98711l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ImageView f98712m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BarcodeDetailsActivity f98713n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f98714o;

    /* compiled from: BarcodeDetailsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.barcode.presentation.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2971a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98715a;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            try {
                iArr[BarcodeFormat.f98753QR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f98715a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BarcodeFormat barcodeFormat, ImageView imageView, BarcodeDetailsActivity barcodeDetailsActivity, String str) {
        super(0);
        this.f98711l = barcodeFormat;
        this.f98712m = imageView;
        this.f98713n = barcodeDetailsActivity;
        this.f98714o = str;
    }

    @Override // Y41.a
    public final G0 invoke() throws Exception {
        BarcodeDetailsActivity.f98681z.getClass();
        int[] iArr = BarcodeDetailsActivity.a.C2966a.f98695a;
        BarcodeFormat barcodeFormat = this.f98711l;
        double d12 = iArr[barcodeFormat.ordinal()] == 1 ? 1.0d : 0.5d;
        ImageView imageView = this.f98712m;
        int measuredWidth = (int) (imageView.getMeasuredWidth() * d12);
        BarcodeDetailsActivity barcodeDetailsActivity = this.f98713n;
        L0 l02 = barcodeDetailsActivity.f98684o;
        if (l02 == null) {
            l02 = null;
        }
        int iMin = Math.min(measuredWidth, l02.d() / 2);
        int[] iArr2 = C2971a.f98715a;
        int iMin2 = iArr2[barcodeFormat.ordinal()] == 1 ? Math.min(imageView.getMeasuredWidth(), iMin) : imageView.getMeasuredWidth();
        Map<EncodeHintType, ?> mapSingletonMap = (iArr2[barcodeFormat.ordinal()] != 1 && com.avito.android.lib.util.darkTheme.c.a(barcodeDetailsActivity)) ? Collections.singletonMap(EncodeHintType.f98765i, Integer.valueOf(y6.b(32))) : null;
        ScreenPerformanceTracker screenPerformanceTracker = barcodeDetailsActivity.f98685p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        try {
            com.avito.android.barcode_encoder.a aVar = barcodeDetailsActivity.f98687r;
            if (aVar == null) {
                aVar = null;
            }
            String str = this.f98714o;
            BarcodeFormat barcodeFormat2 = this.f98711l;
            aVar.getClass();
            try {
                Bitmap bitmapB = com.avito.android.barcode_encoder.a.b(Pg.d.f13229a.a(str, barcodeFormat2, iMin2, iMin, mapSingletonMap));
                imageView.setVisibility(0);
                imageView.setImageBitmap(bitmapB);
                ScreenPerformanceTracker screenPerformanceTracker2 = barcodeDetailsActivity.f98685p;
                if (screenPerformanceTracker2 == null) {
                    screenPerformanceTracker2 = null;
                }
                ScreenPerformanceTracker.a.c(screenPerformanceTracker2, "barcodeRendering", J.b.f90385a, null, 4);
            } catch (Exception e12) {
                String strB = C42833p.b(e12);
                String str2 = barcodeFormat2.f98757b;
                C14892a c14892a = aVar.f98770a;
                c14892a.getClass();
                c14892a.f13971a.c(new Qg.c(str2, str, strB));
                throw e12;
            }
        } catch (Exception e13) {
            ScreenPerformanceTracker screenPerformanceTracker3 = barcodeDetailsActivity.f98685p;
            if (screenPerformanceTracker3 == null) {
                screenPerformanceTracker3 = null;
            }
            ScreenPerformanceTracker.a.c(screenPerformanceTracker3, "barcodeRendering", new J.a(e13), null, 4);
            ((d) barcodeDetailsActivity.f98683n.getValue()).accept(InterfaceC14684a.C0801a.f12478a);
        }
        return G0.f406611a;
    }
}

package com.avito.android.search_view;

import android.content.Context;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.serp.adapter.search_bar.N;
import com.avito.android.util.C35838l3;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ur.InterfaceC49101b;

/* compiled from: SearchViewFactoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/m;", "Lcom/avito/android/serp/adapter/search_bar/N;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements N {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SerpSpaceType f264570a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C35838l3 f264571b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f264572c;

    /* compiled from: SearchViewFactoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f264573a;

        static {
            int[] iArr = new int[SerpSpaceType.values().length];
            try {
                iArr[SerpSpaceType.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SerpSpaceType.AvitoBlack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SerpSpaceType.AvitoSales.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SerpSpaceType.AvitoMall.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SerpSpaceType.AvitoForBusiness.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SerpSpaceType.AutoSelect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SerpSpaceType.ServicesOrderRequest.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SerpSpaceType.AvitoTravel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f264573a = iArr;
        }
    }

    public m(@Y61.k SerpSpaceType serpSpaceType, @Y61.k C35838l3 c35838l3, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f264570a = serpSpaceType;
        this.f264571b = c35838l3;
        this.f264572c = interfaceC49101b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.avito.android.search_view.n] */
    @Override // com.avito.android.serp.adapter.search_bar.N
    @Y61.k
    public final FrameLayout a(@Y61.k FrameLayout frameLayout) {
        Toolbar23SearchView eVar;
        Context context = frameLayout.getContext();
        switch (a.f264573a[this.f264570a.ordinal()]) {
            case 1:
                if (!this.f264572c.d()) {
                    eVar = new e(context, null, 0, 6, null);
                    break;
                } else {
                    eVar = new Toolbar23SearchView(context, null, 0, null, null, 30, null);
                    break;
                }
            case 2:
                eVar = new b(context, null, 0, 6, null);
                break;
            case 3:
                eVar = new c(context, null, 0, 6, null);
                break;
            case 4:
                eVar = new Toolbar23SearchView(context, null, 0, null, null, 30, null);
                break;
            case 5:
                eVar = new Toolbar23SearchView(context, null, 0, null, null, 30, null);
                break;
            case 6:
                eVar = new Toolbar23SearchView(context, null, 0, null, null, 30, null);
                break;
            case 7:
                eVar = new n(context, null, 0, 6, null);
                break;
            case 8:
                eVar = new Toolbar23SearchView(context, null, 0, null, null, 30, null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        eVar.setHint(context.getString(R.string.search));
        eVar.setTopPadding(y6.b(this.f264571b.f318922a ? 12 : 10));
        frameLayout.addView(eVar);
        return eVar;
    }
}

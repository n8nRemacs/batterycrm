package com.avito.android.component.advert_badge_bar;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.lib.design.recyclerview.widget.RatioStretchLayoutManager;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import hw.InterfaceC41177b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kG0.C42580a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertBadgeBar.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001)J!\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0015R*\u0010#\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/AdvertBadgeBar;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;", "Lkotlin/G0;", "badgeClickListener", "setOnBadgeClickListener", "(LY41/l;)V", "Lkotlin/Function0;", "expandButtonClickListener", "setExpandButtonClickListener", "(LY41/a;)V", "", SearchParamsConverterKt.EXPANDED, "setExpanded", "(Z)V", "", "value", "j", "I", "setColumnCount", "(I)V", "columnCount", "k", "getOrientation", "()I", "setOrientation", "orientation", "Lcom/avito/android/component/advert_badge_bar/AdvertBadgeBar$BadgeType;", "l", "Lcom/avito/android/component/advert_badge_bar/AdvertBadgeBar$BadgeType;", "getBadgeType", "()Lcom/avito/android/component/advert_badge_bar/AdvertBadgeBar$BadgeType;", "setBadgeType", "(Lcom/avito/android/component/advert_badge_bar/AdvertBadgeBar$BadgeType;)V", "badgeType", "m", "Z", "isCancelImageLoadingOnDetach", "()Z", "setCancelImageLoadingOnDetach", "BadgeType", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AdvertBadgeBar extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f124922o = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView f124923b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<TV0.b<?, ?>> f124924c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g f124925d;

    /* renamed from: e, reason: collision with root package name */
    public com.avito.konveyor.adapter.h f124926e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e f124927f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public i f124928g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.l<? super BadgeItem, G0> f124929h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Y41.a<G0> f124930i;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int columnCount;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int orientation;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @k
    public BadgeType badgeType;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean isCancelImageLoadingOnDetach;

    /* renamed from: n, reason: collision with root package name */
    public final float f124935n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertBadgeBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/AdvertBadgeBar$BadgeType;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BadgeType {

        /* renamed from: b, reason: collision with root package name */
        public static final BadgeType f124936b;

        /* renamed from: c, reason: collision with root package name */
        public static final BadgeType f124937c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ BadgeType[] f124938d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f124939e;

        static {
            BadgeType badgeType = new BadgeType("DEFAULT", 0);
            f124936b = badgeType;
            BadgeType badgeType2 = new BadgeType("PROFILE", 1);
            f124937c = badgeType2;
            BadgeType[] badgeTypeArr = {badgeType, badgeType2};
            f124938d = badgeTypeArr;
            f124939e = kotlin.enums.c.a(badgeTypeArr);
        }

        public BadgeType() {
            throw null;
        }

        public static BadgeType valueOf(String str) {
            return (BadgeType) Enum.valueOf(BadgeType.class, str);
        }

        public static BadgeType[] values() {
            return (BadgeType[]) f124938d.clone();
        }
    }

    /* compiled from: AdvertBadgeBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BadgeType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BadgeType badgeType = BadgeType.f124936b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AdvertBadgeBar.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/component/advert_badge_bar/AdvertBadgeBar$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends GridLayoutManager.c {
        public b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int f(int i12) {
            AdvertBadgeBar advertBadgeBar = AdvertBadgeBar.this;
            g gVar = advertBadgeBar.f124925d;
            int i13 = advertBadgeBar.columnCount;
            UV0.a<com.avito.conveyor_item.a> aVar = gVar.f125000a;
            com.avito.conveyor_item.a item = null;
            if (aVar != null && i12 >= 0 && i12 < aVar.getCount()) {
                item = aVar.getItem(i12);
            }
            if (item instanceof BadgeItem) {
                return 1;
            }
            return i13;
        }
    }

    @j
    public AdvertBadgeBar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void setColumnCount(int i12) {
        if (this.columnCount != i12) {
            this.columnCount = i12;
            c();
        }
    }

    public final void a() throws BlueprintCollisionException {
        a.C10493a c10493a = new a.C10493a();
        Iterator<T> it = this.f124924c.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        int iOrdinal = this.badgeType.ordinal();
        if (iOrdinal == 0) {
            c10493a.b(new com.avito.android.component.advert_badge_bar.badge_item.a(new com.avito.android.component.advert_badge_bar.a(this)));
        } else if (iOrdinal == 1) {
            c10493a.b(new com.avito.android.component.advert_badge_bar.badge.c(new com.avito.android.component.advert_badge_bar.b(this), this.isCancelImageLoadingOnDetach));
        }
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f124926e = hVar;
        this.f124923b.setAdapter(new com.avito.konveyor.adapter.j(hVar, aVarA));
    }

    public final void b(int i12, @k String str, @k List list) {
        i iVar = new i(list, new com.avito.android.component.advert_badge_bar.title.a("title", str), i12, false, 8, null);
        this.f124925d.f125000a = iVar;
        com.avito.konveyor.adapter.h hVar = this.f124926e;
        if (hVar == null) {
            hVar = null;
        }
        hVar.f338510e = iVar;
        this.f124928g = iVar;
    }

    public final void c() {
        int i12 = this.orientation;
        RecyclerView recyclerView = this.f124923b;
        if (i12 == 1) {
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.columnCount, this.orientation);
            gridLayoutManager.f53667M = new b();
            recyclerView.setLayoutManager(gridLayoutManager);
        } else {
            recyclerView.setLayoutManager(new RatioStretchLayoutManager(getContext(), 0, false, this.f124935n, 0, 22, null));
        }
        e eVar = this.f124927f;
        recyclerView.r0(eVar);
        eVar.f124998k = this.orientation;
        eVar.f124999l = this.columnCount;
        recyclerView.l(eVar, -1);
    }

    @k
    public final BadgeType getBadgeType() {
        return this.badgeType;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        boolean z12 = bundle.getBoolean(SearchParamsConverterKt.EXPANDED);
        i iVar = this.f124928g;
        if (iVar != null) {
            iVar.c(z12);
        }
        super.onRestoreInstanceState(bundle.getParcelable("superState"));
    }

    @Override // android.view.View
    @l
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", parcelableOnSaveInstanceState);
        i iVar = this.f124928g;
        bundle.putBoolean(SearchParamsConverterKt.EXPANDED, iVar != null ? iVar.f125008h : false);
        return bundle;
    }

    public final void setBadgeType(@k BadgeType badgeType) {
        if (this.badgeType != badgeType) {
            this.badgeType = badgeType;
            if (badgeType == BadgeType.f124937c && this.orientation != 1) {
                setOrientation(1);
            }
            a();
        }
    }

    public final void setCancelImageLoadingOnDetach(boolean z12) {
        this.isCancelImageLoadingOnDetach = z12;
    }

    public final void setExpandButtonClickListener(@l Y41.a<G0> expandButtonClickListener) {
        this.f124930i = expandButtonClickListener;
    }

    public final void setExpanded(boolean expanded) {
        i iVar = this.f124928g;
        if (iVar != null) {
            iVar.c(expanded);
            this.f124925d.f125000a = iVar;
            com.avito.konveyor.adapter.h hVar = this.f124926e;
            if (hVar == null) {
                hVar = null;
            }
            hVar.f338510e = iVar;
            RecyclerView.Adapter adapter = this.f124923b.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    public final void setOnBadgeClickListener(@k Y41.l<? super BadgeItem, G0> badgeClickListener) {
        this.f124929h = badgeClickListener;
    }

    public final void setOrientation(int i12) {
        if (this.orientation != i12) {
            if (this.badgeType == BadgeType.f124937c && i12 == 0) {
                return;
            }
            this.orientation = i12;
            c();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvertBadgeBar(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) throws BlueprintCollisionException {
        Object next;
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.advertBadgeBar : i12;
        i13 = (i14 & 8) != 0 ? R.style.Widget_Avito_AdvertBadgeBar : i13;
        super(context, attributeSet, i12);
        List<TV0.b<?, ?>> listSingletonList = Collections.singletonList(new com.avito.android.component.advert_badge_bar.title.b(new com.avito.android.component.advert_badge_bar.title.e(new c(this))));
        this.f124924c = listSingletonList;
        this.f124925d = new g();
        this.f124928g = new i(C42784z0.f406748b, new com.avito.android.component.advert_badge_bar.title.a("", ""), 0, false, 12, null);
        this.columnCount = 1;
        this.badgeType = BadgeType.f124936b;
        this.isCancelImageLoadingOnDetach = true;
        this.f124923b = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.advert_badge_bar, (ViewGroup) this, true).findViewById(R.id.recycler_view);
        Iterator<T> it = listSingletonList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((TV0.b) next) instanceof com.avito.android.component.advert_badge_bar.title.b) {
                    break;
                }
            }
        }
        TV0.b bVar = (TV0.b) next;
        e eVar = new e(context, attributeSet, i12, i13, bVar != null ? TV0.c.a(bVar) : -1);
        this.f124927f = eVar;
        this.f124923b.l(eVar, -1);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C42580a.o.f406211a, i12, i13);
        setColumnCount(typedArrayObtainStyledAttributes.getInteger(8, this.columnCount));
        this.f124935n = typedArrayObtainStyledAttributes.getFloat(4, this.f124935n);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setBadgeType((BadgeType) BadgeType.f124939e.get(typedArrayObtainStyledAttributes.getInt(0, 0)));
        }
        typedArrayObtainStyledAttributes.recycle();
        a();
        new SV.a(8388611, 0, 2, null).b(this.f124923b);
        c();
    }
}

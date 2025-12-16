package com.avito.android.publish.start_publish;

import Cd0.r;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.publish.PublishInitialToast;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StartPublishSheet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishSheet;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "b", "SheetData", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class StartPublishSheet extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f245298N = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f245299E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f245300F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f245301G;

    /* renamed from: H, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f245302H;

    /* renamed from: I, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f245303I;

    /* renamed from: J, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.start_publish.blueprint.d f245304J;

    /* renamed from: K, reason: collision with root package name */
    public RecyclerView f245305K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f245306L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public b f245307M;

    /* compiled from: StartPublishSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.l<View, G0> {
        public final void f(@Y61.k View view) {
            StartPublishSheet startPublishSheet = (StartPublishSheet) this.receiver;
            int i12 = StartPublishSheet.f245298N;
            startPublishSheet.getClass();
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.verticals_list);
            startPublishSheet.f245305K = recyclerView;
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            ((NavBar) view.findViewById(R.id.nav_bar)).setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_close24, startPublishSheet.getContext()), new E(startPublishSheet), false, null, null, null, null, 124, null));
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    /* compiled from: StartPublishSheet.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishSheet$b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a(@Y61.k DeepLink deepLink);
    }

    /* compiled from: StartPublishSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishSheet$SheetData$CategoryShortcutItem;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/start_publish/StartPublishSheet$SheetData$CategoryShortcutItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            SheetData.CategoryShortcutItem categoryShortcutItem = (SheetData.CategoryShortcutItem) obj;
            StartPublishSheet startPublishSheet = StartPublishSheet.this;
            Navigation navigation2 = categoryShortcutItem.f245311c;
            InterfaceC33535v interfaceC33535v = startPublishSheet.f245300F;
            interfaceC33535v.y0(navigation2);
            interfaceC33535v.i(1, categoryShortcutItem.f245310b, navigation2.getMicroCategoryId(), "rubricator");
            startPublishSheet.f245299E.c(new r.a());
            b bVar = startPublishSheet.f245307M;
            if (bVar != null) {
                bVar.a(categoryShortcutItem.f245312d);
            }
        }
    }

    public StartPublishSheet(@Y61.k Context context, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.l Y41.a<G0> aVar) {
        super(context, R.style.PublishStartDialog);
        this.f245299E = interfaceC28373a;
        this.f245300F = interfaceC33535v;
        this.f245301G = aVar;
        this.f245306L = new io.reactivex.rxjava3.disposables.c();
        C(R.layout.start_publish_sheet, new a(1, this, StartPublishSheet.class, "setupContentView", "setupContentView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, false, 3);
        setCancelable(true);
        T();
        K(true);
        J(true);
        int iB2 = y6.b(0);
        com.avito.android.lib.design.bottom_sheet.q qVar = this.f178530x;
        if (qVar != null) {
            qVar.y(iB2);
        }
        S(C35835l0.g(context).y);
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new C(this, 0));
        this.f178532z = false;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.publish.start_publish.di.d.a().build().a(this);
        RecyclerView recyclerView = this.f245305K;
        if (recyclerView == null) {
            recyclerView = null;
        }
        RecyclerView.Adapter<?> adapter = this.f245302H;
        if (adapter == null) {
            adapter = null;
        }
        recyclerView.setAdapter(adapter);
        com.avito.android.publish.start_publish.blueprint.d dVar = this.f245304J;
        this.f245306L.b((dVar != null ? dVar : null).d().t0(new c()));
    }

    /* compiled from: StartPublishSheet.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishSheet$SheetData;", "Landroid/os/Parcelable;", "CategoryShortcutItem", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class SheetData implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SheetData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<CategoryShortcutItem> f245308b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final PublishInitialToast f245309c;

        /* compiled from: StartPublishSheet.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SheetData> {
            @Override // android.os.Parcelable.Creator
            public final SheetData createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(CategoryShortcutItem.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new SheetData(arrayList, (PublishInitialToast) parcel.readParcelable(SheetData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SheetData[] newArray(int i12) {
                return new SheetData[i12];
            }
        }

        public SheetData(@Y61.k List<CategoryShortcutItem> list, @Y61.l PublishInitialToast publishInitialToast) {
            this.f245308b = list;
            this.f245309c = publishInitialToast;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SheetData)) {
                return false;
            }
            SheetData sheetData = (SheetData) obj;
            return kotlin.jvm.internal.L.f(this.f245308b, sheetData.f245308b) && kotlin.jvm.internal.L.f(this.f245309c, sheetData.f245309c);
        }

        public final int hashCode() {
            int iHashCode = this.f245308b.hashCode() * 31;
            PublishInitialToast publishInitialToast = this.f245309c;
            return iHashCode + (publishInitialToast == null ? 0 : publishInitialToast.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "SheetData(shortcuts=" + this.f245308b + ", toast=" + this.f245309c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.f245308b, parcel);
            while (itJ.hasNext()) {
                ((CategoryShortcutItem) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f245309c, i12);
        }

        /* compiled from: StartPublishSheet.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishSheet$SheetData$CategoryShortcutItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class CategoryShortcutItem implements com.avito.conveyor_item.a, Parcelable {

            @Y61.k
            public static final Parcelable.Creator<CategoryShortcutItem> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f245310b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final Navigation f245311c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final DeepLink f245312d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final UniversalImage f245313e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final String f245314f;

            /* compiled from: StartPublishSheet.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CategoryShortcutItem> {
                @Override // android.os.Parcelable.Creator
                public final CategoryShortcutItem createFromParcel(Parcel parcel) {
                    return new CategoryShortcutItem(parcel.readString(), (Navigation) parcel.readParcelable(CategoryShortcutItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(CategoryShortcutItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(CategoryShortcutItem.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CategoryShortcutItem[] newArray(int i12) {
                    return new CategoryShortcutItem[i12];
                }
            }

            public CategoryShortcutItem(@Y61.k String str, @Y61.k Navigation navigation2, @Y61.k DeepLink deepLink, @Y61.k UniversalImage universalImage, @Y61.k String str2) {
                this.f245310b = str;
                this.f245311c = navigation2;
                this.f245312d = deepLink;
                this.f245313e = universalImage;
                this.f245314f = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CategoryShortcutItem)) {
                    return false;
                }
                CategoryShortcutItem categoryShortcutItem = (CategoryShortcutItem) obj;
                return kotlin.jvm.internal.L.f(this.f245310b, categoryShortcutItem.f245310b) && kotlin.jvm.internal.L.f(this.f245311c, categoryShortcutItem.f245311c) && kotlin.jvm.internal.L.f(this.f245312d, categoryShortcutItem.f245312d) && kotlin.jvm.internal.L.f(this.f245313e, categoryShortcutItem.f245313e) && kotlin.jvm.internal.L.f(this.f245314f, categoryShortcutItem.f245314f);
            }

            @Override // TV0.a
            /* renamed from: getId */
            public final long getF83558b() {
                return getF246478b().hashCode();
            }

            @Override // com.avito.conveyor_item.a
            @Y61.k
            /* renamed from: getStringId, reason: from getter */
            public final String getF246478b() {
                return this.f245314f;
            }

            public final int hashCode() {
                return this.f245314f.hashCode() + com.avito.android.actions_sheet.a.a(com.avito.android.actions_sheet.a.e(this.f245312d, (this.f245311c.hashCode() + (this.f245310b.hashCode() * 31)) * 31, 31), 31, this.f245313e);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("CategoryShortcutItem(title=");
                sb2.append(this.f245310b);
                sb2.append(", navigation=");
                sb2.append(this.f245311c);
                sb2.append(", deeplink=");
                sb2.append(this.f245312d);
                sb2.append(", image=");
                sb2.append(this.f245313e);
                sb2.append(", stringId=");
                return C22026a.c(sb2, this.f245314f, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f245310b);
                parcel.writeParcelable(this.f245311c, i12);
                parcel.writeParcelable(this.f245312d, i12);
                parcel.writeParcelable(this.f245313e, i12);
                parcel.writeString(this.f245314f);
            }

            public /* synthetic */ CategoryShortcutItem(String str, Navigation navigation2, DeepLink deepLink, UniversalImage universalImage, String str2, int i12, C42822w c42822w) {
                this(str, navigation2, deepLink, universalImage, (i12 & 16) != 0 ? navigation2.toString() : str2);
            }
        }
    }
}

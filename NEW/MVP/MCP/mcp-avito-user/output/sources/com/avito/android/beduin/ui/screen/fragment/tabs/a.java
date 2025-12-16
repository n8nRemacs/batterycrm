package com.avito.android.beduin.ui.screen.fragment.tabs;

import Hr.InterfaceC14024a;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.beduin.ui.screen.fragment.tab.BeduinTabFragment;
import com.avito.android.beduin.ui.screen.fragment.tab.BeduinTabOpenParams;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.universal_map.UniversalMapParams;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import vi.C49332a;
import vi.C49335d;

/* compiled from: TabsPagerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/a;", "Landroidx/viewpager2/adapter/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends androidx.viewpager2.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.i f104328k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f104329l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public Object f104330m;

    /* compiled from: TabsPagerAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "topMapFormId", "", "topMapComponents", "", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.ui.screen.fragment.tabs.a$a, reason: collision with other inner class name */
    public static final class C3119a extends N implements Y41.p<String, List<? extends BeduinModel>, Long> {
        public C3119a() {
            super(2);
        }

        @Override // Y41.p
        public final Long invoke(String str, List<? extends BeduinModel> list) {
            return Long.valueOf(a.this.f104329l.a(new UniversalMapParams.BeduinForm(str, list)));
        }
    }

    public a(@Y61.k Fragment fragment, @Y61.k com.avito.android.universal_map.i iVar, @Y61.k InterfaceC14024a interfaceC14024a) {
        super(fragment);
        this.f104328k = iVar;
        this.f104329l = interfaceC14024a;
        this.f104330m = C42784z0.f406748b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f104330m.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.viewpager2.adapter.b
    @Y61.k
    public final Fragment l(int i12) {
        TabsScreenModel.c cVar = (TabsScreenModel.c) this.f104330m.get(i12);
        if (cVar instanceof C49335d) {
            C49335d c49335d = (C49335d) cVar;
            String pointListRequest = c49335d.getPointListRequest();
            String pointInfoRequest = c49335d.getPointInfoRequest();
            String filtersInfoRequest = c49335d.getFiltersInfoRequest();
            new com.avito.android.universal_map.o();
            UniversalMapParams.MapSettings mapSettingsA = com.avito.android.universal_map.o.a(c49335d.getMapSettings(), new C3119a());
            Map<String, Object> mapA = c49335d.a();
            if (mapA == null) {
                mapA = P0.c();
            }
            return this.f104328k.a(new UniversalMapParams(pointListRequest, pointInfoRequest, filtersInfoRequest, null, mapSettingsA, mapA, new UniversalMapParams.TrackerSettings.TrackByUniversalMap(c49335d.getScreenName()), c49335d.getOnOpenEvent(), null, 256, null), null);
        }
        if (!(cVar instanceof C49332a)) {
            throw new IllegalStateException(("Unknown tabContent " + cVar).toString());
        }
        C49332a c49332a = (C49332a) cVar;
        BeduinForm topForm = c49332a.getTopForm();
        String f105312b = topForm != null ? topForm.getF105312b() : null;
        String f105312b2 = c49332a.getMainForm().getF105312b();
        BeduinForm bottomForm = c49332a.getBottomForm();
        BeduinTabOpenParams beduinTabOpenParams = new BeduinTabOpenParams(f105312b, f105312b2, bottomForm != null ? bottomForm.getF105312b() : null, null, 8, null);
        BeduinTabFragment.f104278z0.getClass();
        BeduinTabFragment beduinTabFragment = new BeduinTabFragment();
        beduinTabFragment.f104286u0.setValue(beduinTabFragment, BeduinTabFragment.f104277A0[0], beduinTabOpenParams);
        Bundle arguments = beduinTabFragment.getArguments();
        if (arguments == null) {
            return beduinTabFragment;
        }
        arguments.putInt("arg_padding", 0);
        return beduinTabFragment;
    }
}

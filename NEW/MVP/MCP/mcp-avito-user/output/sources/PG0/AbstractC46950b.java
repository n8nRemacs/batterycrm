package pG0;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.view.C23038g0;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.avito_map.AvitoMapView;
import com.jakewharton.rxbinding4.view.C37722i;
import com.jakewharton.rxrelay3.c;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.L;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import qG0.C47290a;

/* compiled from: BaseUniversalMapView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpG0/b;", "LpG0/a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pG0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC46950b implements InterfaceC46949a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f428286b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AvitoMapAttachHelper f428287c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FragmentManager f428288d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c<C47290a> f428289e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f428290f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AvitoMapView f428291g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final L f428292h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final z<G0> f428293i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C23038g0<Boolean> f428294j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public AvitoMap f428295k;

    public AbstractC46950b(@k View view, @k AvitoMapAttachHelper avitoMapAttachHelper, @k FragmentManager fragmentManager) {
        this.f428286b = view;
        this.f428287c = avitoMapAttachHelper;
        this.f428288d = fragmentManager;
        c<C47290a> cVar = new c<>();
        this.f428289e = cVar;
        View viewFindViewById = view.findViewById(R.id.find_me_button);
        this.f428290f = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.map);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.avito_map.AvitoMapView");
        }
        this.f428291g = (AvitoMapView) viewFindViewById2;
        this.f428292h = cVar.D(io.reactivex.rxjava3.internal.functions.a.f401991a);
        this.f428293i = C37722i.a(viewFindViewById);
        this.f428294j = new C23038g0<>(Boolean.FALSE);
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    public void onMapAttach(@k AvitoMap avitoMap) {
        this.f428295k = avitoMap;
        AvitoMapUiSettings uiSettings = avitoMap.getUiSettings();
        uiSettings.isRotateGesturesEnabled(false);
        uiSettings.isTiltGesturesEnabled(false);
        this.f428294j.setValue(Boolean.TRUE);
    }
}

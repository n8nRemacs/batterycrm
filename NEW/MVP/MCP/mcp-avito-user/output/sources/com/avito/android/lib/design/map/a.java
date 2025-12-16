package com.avito.android.lib.design.map;

import Y41.l;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.r;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.lib.design.map.state.MapState;
import com.avito.android.pinch_to_zoom.f;
import e11.C39854b0;
import e11.E1;
import e11.M;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42745f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f179591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f179592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f179593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f179594e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i12) {
        this.f179591b = i12;
        this.f179592c = obj;
        this.f179593d = obj2;
        this.f179594e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Y41.a<G0> aVar;
        l<AvitoMapPoint, G0> lVar;
        Y41.a<G0> aVar2;
        Object obj = this.f179594e;
        Object obj2 = this.f179593d;
        Object obj3 = this.f179592c;
        switch (this.f179591b) {
            case 0:
                int i12 = b.f179595n;
                int action = motionEvent.getAction();
                b bVar = (b) obj3;
                if (action != 0) {
                    if (action == 1) {
                        MapState mapState = bVar.f179599e;
                        if (mapState == null || (aVar2 = mapState.f179625k) == null) {
                            return true;
                        }
                        aVar2.invoke();
                        return true;
                    }
                    if (action != 2) {
                        return false;
                    }
                }
                Float fValueOf = Float.valueOf(motionEvent.getX());
                Float fValueOf2 = Float.valueOf(motionEvent.getY());
                InterfaceC42726C<? extends AvitoMap> interfaceC42726C = bVar.f179600f;
                AvitoMapPoint avitoMapPointFromPx = bVar.getAvitoMapPointFromPx(fValueOf, fValueOf2, interfaceC42726C != null ? interfaceC42726C.getValue() : null);
                if (avitoMapPointFromPx == null) {
                    MapState mapState2 = bVar.f179599e;
                    if (mapState2 == null || (aVar = mapState2.f179625k) == null) {
                        return true;
                    }
                    aVar.invoke();
                    return true;
                }
                ArrayList arrayList = (ArrayList) obj2;
                arrayList.add(avitoMapPointFromPx);
                MapState mapState3 = bVar.f179599e;
                if (mapState3 != null && (lVar = mapState3.f179624j) != null) {
                    lVar.invoke(avitoMapPointFromPx);
                }
                if (arrayList.size() <= 1) {
                    return true;
                }
                List listU = C42745f0.U(r.j(2, arrayList), r.j(1, arrayList));
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(new MapState.c(listU.toString(), listU));
                bVar.a(bVar.f179606l, arrayList2);
                return true;
            case 1:
                int i13 = f.f220006f;
                boolean zD2 = ((com.avito.android.pinch_to_zoom.b) obj3).d(motionEvent, (ImageView) obj2);
                if (!zD2 && motionEvent.getAction() == 1) {
                    ((View) obj).performClick();
                }
                return zD2;
            default:
                int i14 = C39854b0.f394528h;
                C39854b0 c39854b0 = (C39854b0) obj3;
                c39854b0.getClass();
                if (((E1) obj2).f394339h) {
                    int action2 = motionEvent.getAction();
                    M m12 = c39854b0.f394530b;
                    if (action2 == 0) {
                        m12.setBackgroundColor(-3806472);
                    } else if (action2 == 1) {
                        m12.setBackgroundColor(-1);
                        ((View.OnClickListener) obj).onClick(view);
                    } else if (action2 == 3) {
                        c39854b0.setBackgroundColor(-1);
                    }
                }
                return true;
        }
    }
}

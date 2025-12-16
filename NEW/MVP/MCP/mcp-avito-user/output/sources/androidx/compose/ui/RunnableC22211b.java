package androidx.compose.ui;

import android.os.Handler;
import com.avito.android.home.bottom_navigation.C30759a;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.L;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.compose.ui.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC22211b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f38943c;

    public /* synthetic */ RunnableC22211b(int i12, Y41.a aVar) {
        this.f38942b = i12;
        this.f38943c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y41.a aVar = this.f38943c;
        switch (this.f38942b) {
            case 0:
                Handler handler = C22212c.f38944a;
                aVar.invoke();
                break;
            case 1:
                aVar.invoke();
                break;
            case 2:
                int i12 = com.avito.android.advert.item.ownership_cost.items.l.f78030i;
                aVar.invoke();
                break;
            case 3:
                int i13 = com.avito.android.advert.item.ownership_cost.items.l.f78030i;
                aVar.invoke();
                break;
            case 4:
                aVar.invoke();
                break;
            case 5:
                aVar.invoke();
                break;
            case 6:
                aVar.invoke();
                break;
            case 7:
                int i14 = com.avito.android.campaigns_sale.z.f114452s;
                aVar.invoke();
                break;
            case 8:
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 9:
                int i15 = C30759a.f162335f;
                aVar.invoke();
                break;
            case 10:
                int i16 = com.avito.android.hotel_available_rooms.konveyor.gallery.o.f162950g;
                aVar.invoke();
                break;
            case 11:
                aVar.invoke();
                break;
            case 12:
                int i17 = L.f273402s;
                aVar.invoke();
                break;
            case 13:
                aVar.invoke();
                break;
            case 14:
                aVar.invoke();
                break;
            default:
                ru.cyberity.input.tools.threading.a.b(aVar);
                break;
        }
    }
}

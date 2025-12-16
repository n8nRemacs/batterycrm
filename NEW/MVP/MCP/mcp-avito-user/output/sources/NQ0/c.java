package nq0;

import C11.b;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.select_districts.SelectDistrictsFragment;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: SelectableDistrictsFragmentComponent.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lnq0/c;", "", "a", "b", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: SelectableDistrictsFragmentComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnq0/c$a;", "", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        c a(@h31.b @k C28478k c28478k, @h31.b int i12, @h31.b @InterfaceC44467b boolean z12, @h31.b @InterfaceC44466a @k Set set, @h31.b @k com.avito.android.select_districts.c cVar, @h31.b @k com.avito.android.select_districts.d dVar, @h31.b @k com.avito.android.select_districts.e eVar);
    }

    /* compiled from: SelectableDistrictsFragmentComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnq0/c$b;", "Lcom/avito/android/di/h;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h {
        @k
        a Hj();
    }

    void a(@k SelectDistrictsFragment selectDistrictsFragment);
}

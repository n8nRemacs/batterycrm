package com.avito.android.publish.details.adapter.historical_suggest.new_suggest;

import Y41.p;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import androidx.core.view.C22829k0;
import com.avito.android.R;
import com.avito.android.historical_suggests.model.AddressType;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.sequences.C43033p;
import oI.AbstractC44648a;

/* compiled from: HistoricalSuggestsNewView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/adapter/historical_suggest/new_suggest/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/details/adapter/historical_suggest/new_suggest/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC44648a f233273b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public p<? super AddressParameter.Value, ? super AddressType, G0> f233274c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public p<? super AddressParameter.Value, ? super AddressType, G0> f233275d;

    /* compiled from: HistoricalSuggestsNewView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", AddressParameter.TYPE, "Lcom/avito/android/historical_suggests/model/AddressType;", "type", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;Lcom/avito/android/historical_suggests/model/AddressType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<AddressParameter.Value, AddressType, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(AddressParameter.Value value, AddressType addressType) {
            AddressParameter.Value value2 = value;
            AddressType addressType2 = addressType;
            p<? super AddressParameter.Value, ? super AddressType, G0> pVar = j.this.f233274c;
            if (pVar != null) {
                pVar.invoke(value2, addressType2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HistoricalSuggestsNewView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", AddressParameter.TYPE, "Lcom/avito/android/historical_suggests/model/AddressType;", "type", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;Lcom/avito/android/historical_suggests/model/AddressType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<AddressParameter.Value, AddressType, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(AddressParameter.Value value, AddressType addressType) {
            AddressParameter.Value value2 = value;
            AddressType addressType2 = addressType;
            p<? super AddressParameter.Value, ? super AddressType, G0> pVar = j.this.f233275d;
            if (pVar != null) {
                pVar.invoke(value2, addressType2);
            }
            return G0.f406611a;
        }
    }

    public j(@Y61.k View view, @Y61.k Y41.l<? super Context, ? extends AbstractC44648a> lVar) {
        super(view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.historical_suggests_container);
        Object objN = C43033p.n(new C22829k0(frameLayout));
        AbstractC44648a abstractC44648a = objN instanceof AbstractC44648a ? (AbstractC44648a) objN : null;
        if (abstractC44648a == null) {
            abstractC44648a = (AbstractC44648a) ((com.avito.android.publish.details.adapter.historical_suggest.new_suggest.a) lVar).invoke(view.getContext());
            frameLayout.removeAllViews();
            frameLayout.addView(abstractC44648a, new FrameLayout.LayoutParams(-1, -2));
        }
        this.f233273b = abstractC44648a;
        abstractC44648a.setSelectListenerFunction(new a());
        abstractC44648a.setDataLoadedListenerFunction(new b());
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.new_suggest.i
    public final void AH(@Y61.k p<? super AddressParameter.Value, ? super AddressType, G0> pVar) {
        this.f233275d = pVar;
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.new_suggest.i
    public final void Sh(@Y61.k p<? super AddressParameter.Value, ? super AddressType, G0> pVar) {
        this.f233274c = pVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        AbstractC44648a abstractC44648a = this.f233273b;
        abstractC44648a.setSelectListenerFunction(null);
        abstractC44648a.setDataLoadedListenerFunction(null);
        this.f233274c = null;
        this.f233275d = null;
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.new_suggest.i
    public final void setVisibility(boolean z12) {
        this.f233273b.setContentVisibility(z12);
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.new_suggest.i
    public final void xR(@Y61.k AddressParameter.Value value) {
        this.f233273b.a(value);
    }
}

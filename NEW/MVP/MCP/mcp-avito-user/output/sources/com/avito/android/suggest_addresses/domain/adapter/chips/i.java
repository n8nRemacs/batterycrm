package com.avito.android.suggest_addresses.domain.adapter.chips;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedAddressesView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_addresses/domain/adapter/chips/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/suggest_addresses/domain/adapter/chips/h;", "b", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f291854b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Chips f291855c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f291856d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super com.avito.android.lib.design.chips.h, G0> f291857e;

    /* compiled from: SelectedAddressesView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/suggest_addresses/domain/adapter/chips/i$a", "Lcom/avito/android/lib/design/chips/Chips$e;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.e {
        public a() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.e
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
            Y41.l<? super com.avito.android.lib.design.chips.h, G0> lVar = i.this.f291857e;
            if (lVar != null) {
                lVar.invoke(hVar);
            }
        }
    }

    /* compiled from: SelectedAddressesView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/suggest_addresses/domain/adapter/chips/i$b;", "", "<init>", "()V", "", "MAX_VALUES", "I", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: SelectedAddressesView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "lineSpaceAvailable", "", "position", "Lkotlin/G0;", "invoke", "(ZI)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<Boolean, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f291860m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12) {
            super(2);
            this.f291860m = i12;
        }

        @Override // Y41.p
        public final G0 invoke(Boolean bool, Integer num) throws Resources.NotFoundException {
            boolean zBooleanValue = bool.booleanValue();
            int iIntValue = num.intValue();
            i iVar = i.this;
            Integer maxLines = iVar.f291855c.getMaxLines();
            if (maxLines != null && maxLines.intValue() == 3) {
                Button button = iVar.f291856d;
                if (zBooleanValue) {
                    D6.w(button);
                } else {
                    Resources resources = iVar.f291854b.getContext().getResources();
                    int i12 = this.f291860m - iIntValue;
                    String quantityString = resources.getQuantityString(R.plurals.select_addresses_show_selected, i12, Integer.valueOf(i12));
                    D6.H(button);
                    button.setText(quantityString);
                }
            }
            return G0.f406611a;
        }
    }

    static {
        new b(null);
    }

    public i(@k View view) {
        super(view);
        this.f291854b = view;
        View viewFindViewById = view.findViewById(R.id.addresses_chips);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        Chips chips = (Chips) viewFindViewById;
        this.f291855c = chips;
        View viewFindViewById2 = view.findViewById(R.id.show_chips);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById2;
        this.f291856d = button;
        button.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 13));
        chips.setChipsOnRightDrawableClickedListener(new a());
    }

    @Override // com.avito.android.suggest_addresses.domain.adapter.chips.h
    public final void C1(@k List<? extends com.avito.android.lib.design.chips.h> list) {
        this.f291855c.setData(list);
    }

    @Override // com.avito.android.suggest_addresses.domain.adapter.chips.h
    public final void Ym(int i12) {
        this.f291855c.setEllipsizeCallback(new c(i12));
    }

    @Override // com.avito.android.suggest_addresses.domain.adapter.chips.h
    public final void am(boolean z12) {
        D6.G(this.f291855c, z12);
    }

    @Override // com.avito.android.suggest_addresses.domain.adapter.chips.h
    public final void m50(@k Y41.l<? super com.avito.android.lib.design.chips.h, G0> lVar) {
        this.f291857e = lVar;
    }
}

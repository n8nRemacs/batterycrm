package com.avito.android.user_address.map.view;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.geo_common.model.location_picker.LocationPickerAddressType;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.user_address.NavigationController;
import com.avito.android.user_address.map.mvi.A;
import com.avito.android.user_address.map.mvi.ScreenState;
import com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState;
import com.avito.android.user_address.map.mvi.UserAddressMapFullAddressMviState;
import com.avito.android.util.D6;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressMapFullAddressViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/view/i;", "Lcom/avito/android/user_address/map/view/d;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapFullAddressMviState;", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.android.user_address.map.view.d<UserAddressMapFullAddressMviState> {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final NavigationController.Mode f307962r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Button f307963s;

    /* renamed from: t, reason: collision with root package name */
    public final Chips f307964t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Input f307965u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Input f307966v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Input f307967w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final Input f307968x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final ImageButton f307969y;

    /* compiled from: UserAddressMapFullAddressViewImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/view/i$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LocationPickerAddressType f307970b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f307971c;

        public a(@Y61.k LocationPickerAddressType locationPickerAddressType, @Y61.k String str) {
            this.f307970b = locationPickerAddressType;
            this.f307971c = str;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@Y61.k Object obj) {
            a aVar = obj instanceof a ? (a) obj : null;
            return this.f307970b == (aVar != null ? aVar.f307970b : null);
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W */
        public final CharSequence getF262141c() {
            return this.f307971c;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF106770d() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF15843e() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }
    }

    /* compiled from: UserAddressMapFullAddressViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[NavigationController.Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NavigationController.Mode mode = NavigationController.Mode.f307098b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: UserAddressMapFullAddressViewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_address.map.e f307981l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.avito.android.user_address.map.e eVar) {
            super(1);
            this.f307981l = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f307981l.accept(new A.g(str));
            return G0.f406611a;
        }
    }

    public i(@Y61.k View view, @Y61.k NavigationController.Mode mode) {
        super(view, true);
        this.f307962r = mode;
        this.f307963s = (Button) view.findViewById(R.id.button);
        Chips chips = (Chips) view.findViewById(R.id.address_type_chips);
        this.f307964t = chips;
        this.f307965u = (Input) view.findViewById(R.id.apartment_input_view);
        this.f307966v = (Input) view.findViewById(R.id.entrance_input_view);
        this.f307967w = (Input) view.findViewById(R.id.floor_input_view);
        this.f307968x = (Input) view.findViewById(R.id.comment_input_view);
        this.f307969y = (ImageButton) view.findViewById(R.id.delete_image_button);
        chips.setData(C42745f0.U(new a(LocationPickerAddressType.HOME, view.getResources().getString(R.string.addressTypeHome)), new a(LocationPickerAddressType.WORK, view.getResources().getString(R.string.addressTypeWork)), new a(LocationPickerAddressType.OTHER, view.getResources().getString(R.string.addressTypeOther))));
        chips.invalidate();
    }

    @Override // com.avito.android.user_address.map.view.h
    public final void G(@Y61.k Toolbar toolbar) {
        int i12;
        int iOrdinal = this.f307962r.ordinal();
        if (iOrdinal == 0) {
            i12 = R.string.new_address_title;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.string.edit_address_title;
        }
        ((TextView) toolbar.findViewById(R.id.toolbar_title)).setText(i12);
    }

    @Override // com.avito.android.user_address.map.view.d
    public final void a(UserAddressAddNewAddressMviState userAddressAddNewAddressMviState) {
        UserAddressMapFullAddressMviState userAddressMapFullAddressMviState = (UserAddressMapFullAddressMviState) userAddressAddNewAddressMviState;
        super.a(userAddressMapFullAddressMviState);
        Input.t(this.f307965u, userAddressMapFullAddressMviState.f307736m, true, 2);
        Input.t(this.f307966v, userAddressMapFullAddressMviState.f307737n, true, 2);
        Input.t(this.f307967w, userAddressMapFullAddressMviState.f307738o, true, 2);
        Input.t(this.f307968x, userAddressMapFullAddressMviState.f307739p, true, 2);
        a aVar = new a(userAddressMapFullAddressMviState.f307740q, "");
        Chips chips = this.f307964t;
        int i12 = Chips.f178664L;
        chips.q(aVar, true);
        boolean z12 = userAddressMapFullAddressMviState.f307725b instanceof ScreenState.CommonState;
        ImageButton imageButton = this.f307969y;
        if (z12) {
            imageButton.setVisibility(userAddressMapFullAddressMviState.f307734k ? 0 : 8);
        } else {
            D6.w(imageButton);
        }
    }

    @Override // com.avito.android.user_address.map.view.d, com.avito.android.user_address.map.view.h
    public final void c(@Y61.k com.avito.android.user_address.map.e eVar) {
        super.c(eVar);
        this.f307963s.setOnClickListener(new com.avito.android.user_address.map.view.a(eVar, 3));
        Input input = this.f307965u;
        input.b(new c(input, eVar));
        Input input2 = this.f307966v;
        input2.b(new d(input2, eVar));
        Input input3 = this.f307967w;
        input3.b(new e(input3, eVar));
        n.c(this.f307968x, new f(eVar));
        this.f307964t.setChipsSelectedListener(new g(eVar));
        this.f307969y.setOnClickListener(new com.avito.android.user_address.map.view.a(eVar, 4));
    }

    /* compiled from: UserAddressMapFullAddressViewImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_address/map/view/i$g", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_address.map.e f307982a;

        public g(com.avito.android.user_address.map.e eVar) {
            this.f307982a = eVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            LocationPickerAddressType locationPickerAddressType;
            a aVar = hVar instanceof a ? (a) hVar : null;
            if (aVar == null || (locationPickerAddressType = aVar.f307970b) == null) {
                locationPickerAddressType = LocationPickerAddressType.OTHER;
            }
            this.f307982a.accept(new A.e(locationPickerAddressType));
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f307972b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f307973c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_address.map.e f307974d;

        public c(Input input, com.avito.android.user_address.map.e eVar) {
            this.f307973c = input;
            this.f307974d = eVar;
            this.f307972b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f307973c.getDeformattedText();
            if (L.f(deformattedText, this.f307972b)) {
                return;
            }
            this.f307974d.accept(new A.f(deformattedText));
            this.f307972b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f307975b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f307976c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_address.map.e f307977d;

        public d(Input input, com.avito.android.user_address.map.e eVar) {
            this.f307976c = input;
            this.f307977d = eVar;
            this.f307975b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f307976c.getDeformattedText();
            if (L.f(deformattedText, this.f307975b)) {
                return;
            }
            this.f307977d.accept(new A.m(deformattedText));
            this.f307975b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f307978b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f307979c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_address.map.e f307980d;

        public e(Input input, com.avito.android.user_address.map.e eVar) {
            this.f307979c = input;
            this.f307980d = eVar;
            this.f307978b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f307979c.getDeformattedText();
            if (L.f(deformattedText, this.f307978b)) {
                return;
            }
            this.f307980d.accept(new A.p(deformattedText));
            this.f307978b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}

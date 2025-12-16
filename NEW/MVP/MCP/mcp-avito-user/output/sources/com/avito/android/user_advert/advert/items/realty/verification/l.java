package com.avito.android.user_advert.advert.items.realty.verification;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43059p;

/* compiled from: RealtyVerificationItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/verification/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/realty/verification/j;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f309971h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f309972b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f309973c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Banner f309974d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Input f309975e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public ComponentContainer f309976f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetails.CadastralField f309977g;

    /* compiled from: RealtyVerificationItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f309978a;

        static {
            int[] iArr = new int[MyAdvertDetails.VerificationStatus.values().length];
            try {
                iArr[MyAdvertDetails.VerificationStatus.REQUEST_CADASTRAL_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyAdvertDetails.VerificationStatus.REQUEST_PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MyAdvertDetails.VerificationStatus.VERIFICATION_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MyAdvertDetails.VerificationStatus.OWNERSHIP_VERIFICATION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MyAdvertDetails.VerificationStatus.PASSPORT_VERIFICATION_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f309978a = iArr;
        }
    }

    public l(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f309972b = aVar;
        this.f309973c = view.getContext();
        this.f309974d = (Banner) view;
    }

    @Override // com.avito.android.user_advert.advert.items.realty.verification.j
    public final void Au(@Y61.k String str, @Y61.k MyAdvertDetails.VerificationStatus verificationStatus) {
        Banner banner = this.f309974d;
        TextView textView = (TextView) banner.findViewById(R.id.realty_verification_title);
        if (verificationStatus == MyAdvertDetails.VerificationStatus.OWNERSHIP_VERIFICATION_ERROR) {
            textView.setVisibility(8);
            banner.setTitle(str);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.realty.verification.j
    public final void DC(@Y61.l MyAdvertDetails.CadastralField cadastralField, @Y61.k Y41.a<G0> aVar) {
        Banner banner = this.f309974d;
        this.f309975e = (Input) banner.findViewById(R.id.realty_verification_cadastral);
        ComponentContainer componentContainer = (ComponentContainer) banner.findViewById(R.id.realty_verification_cadastral_container);
        this.f309976f = componentContainer;
        if (componentContainer != null) {
            componentContainer.setVisibility(cadastralField != null ? 0 : 8);
        }
        if (cadastralField == null) {
            return;
        }
        this.f309977g = cadastralField;
        Input input = this.f309975e;
        if (input != null) {
            input.setHint(cadastralField.getPlaceholder());
        }
        Input input2 = this.f309975e;
        if (input2 != null) {
            MyAdvertDetails.CadastralField cadastralField2 = this.f309977g;
            Input.t(input2, cadastralField2 != null ? cadastralField2.getValue() : null, false, 6);
        }
        Input input3 = this.f309975e;
        if (input3 != null) {
            input3.setRightIconListener(new com.avito.android.travel_guest_profile.items.profile_header.h(23, aVar));
        }
        Input input4 = this.f309975e;
        if (input4 != null) {
            input4.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 15));
        }
        ComponentContainer componentContainer2 = this.f309976f;
        if (componentContainer2 != null) {
            MyAdvertDetails.CadastralField cadastralField3 = this.f309977g;
            componentContainer2.setTitle(cadastralField3 != null ? cadastralField3.getTitle() : null);
        }
        ComponentContainer componentContainer3 = this.f309976f;
        if (componentContainer3 != null) {
            MyAdvertDetails.CadastralField cadastralField4 = this.f309977g;
            componentContainer3.setMessage(cadastralField4 != null ? cadastralField4.getDetails() : null);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.realty.verification.j
    public final void Le(@Y61.l SimpleAdvertAction simpleAdvertAction, @Y61.k final MyAdvertDetails.VerificationStatus verificationStatus, @Y61.k final Y41.l<? super String, G0> lVar) {
        Button button = (Button) this.f309974d.findViewById(R.id.realty_verification_action);
        com.avito.android.lib.design.button.b.a(button, simpleAdvertAction != null ? simpleAdvertAction.getTitle() : null, false);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.user_advert.advert.items.realty.verification.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String validationRegexp;
                int i12 = l.f309971h;
                MyAdvertDetails.VerificationStatus verificationStatus2 = MyAdvertDetails.VerificationStatus.REQUEST_CADASTRAL_NUMBER;
                l lVar2 = this.f309968b;
                if (verificationStatus == verificationStatus2) {
                    Input input = lVar2.f309975e;
                    Editable editableM53getText = input != null ? input.m53getText() : null;
                    if (editableM53getText == null || editableM53getText.length() == 0) {
                        ComponentContainer componentContainer = lVar2.f309976f;
                        if (componentContainer != null) {
                            MyAdvertDetails.CadastralField cadastralField = lVar2.f309977g;
                            ComponentContainer.n(componentContainer, cadastralField != null ? cadastralField.getEmptyInputErrorMessage() : null, 2);
                            return;
                        }
                        return;
                    }
                    MyAdvertDetails.CadastralField cadastralField2 = lVar2.f309977g;
                    if (cadastralField2 != null && (validationRegexp = cadastralField2.getValidationRegexp()) != null && !new C43059p(validationRegexp).e(editableM53getText)) {
                        ComponentContainer componentContainer2 = lVar2.f309976f;
                        if (componentContainer2 != null) {
                            MyAdvertDetails.CadastralField cadastralField3 = lVar2.f309977g;
                            ComponentContainer.n(componentContainer2, cadastralField3 != null ? cadastralField3.getValidationErrorMessage() : null, 2);
                            return;
                        }
                        return;
                    }
                }
                Input input2 = lVar2.f309975e;
                ((g) lVar).invoke(String.valueOf(input2 != null ? input2.m53getText() : null));
            }
        });
    }

    @Override // com.avito.android.user_advert.advert.items.realty.verification.j
    public final void g(@Y61.k AttributedText attributedText) {
        ((TextView) this.f309974d.findViewById(R.id.realty_verification_description)).setText(this.f309972b.c(this.f309973c, attributedText));
    }

    @Override // com.avito.android.user_advert.advert.items.realty.verification.j
    public final void nA(@Y61.k MyAdvertDetails.VerificationStatus verificationStatus) {
        int i12;
        ImageView imageView = (ImageView) this.f309974d.findViewById(R.id.realty_verification_image);
        int i13 = a.f309978a[verificationStatus.ordinal()];
        if (i13 == 1 || i13 == 2) {
            i12 = 0;
        } else {
            if (i13 != 3 && i13 != 4 && i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 8;
        }
        imageView.setVisibility(i12);
    }

    @Override // com.avito.android.user_advert.advert.items.realty.verification.j
    public final void rg(@Y61.k MyAdvertDetails.VerificationStatus verificationStatus, @Y61.k Y41.a<G0> aVar) {
        int i12;
        int i13 = a.f309978a[verificationStatus.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            i12 = R.attr.bannerBlue;
        } else {
            if (i13 != 4 && i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.attr.bannerOrange;
        }
        Banner banner = this.f309974d;
        banner.i(R.layout.realty_verification_content, i12);
        if (verificationStatus == MyAdvertDetails.VerificationStatus.OWNERSHIP_VERIFICATION_ERROR) {
            banner.setCloseButtonVisible(true);
            banner.setCloseButtonListener(new com.avito.android.travel_guest_profile.items.profile_header.h(24, aVar));
        }
    }

    @Override // com.avito.android.user_advert.advert.items.realty.verification.j
    public final void setLoading(boolean z12) {
        this.f309974d.setEnabled(!z12);
    }
}

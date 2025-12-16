package com.avito.android.profile_phones;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.profile_phones.add_phone.AddPhoneArguments;
import com.avito.android.profile_phones.add_phone.AddPhoneFragment;
import com.avito.android.profile_phones.confirm_phone.ConfirmPhoneFragment;
import com.avito.android.profile_phones.confirm_phone.PhoneConfirmationArguments;
import com.avito.android.profile_phones.confirm_phone.PhoneConfirmationWithCodeRequestArguments;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationArguments;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationFragment;
import com.avito.android.profile_phones.phone_action.PhoneActionArguments;
import com.avito.android.profile_phones.phone_action.PhoneActionFragment;
import com.avito.android.util.G;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneActionActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_phones/PhoneActionActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "PhoneActionType", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneActionActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f226783m = new a(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhoneActionActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/PhoneActionActivity$PhoneActionType;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PhoneActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final PhoneActionType f226784b;

        /* renamed from: c, reason: collision with root package name */
        public static final PhoneActionType f226785c;

        /* renamed from: d, reason: collision with root package name */
        public static final PhoneActionType f226786d;

        /* renamed from: e, reason: collision with root package name */
        public static final PhoneActionType f226787e;

        /* renamed from: f, reason: collision with root package name */
        public static final PhoneActionType f226788f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ PhoneActionType[] f226789g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f226790h;

        static {
            PhoneActionType phoneActionType = new PhoneActionType("ADD", 0);
            f226784b = phoneActionType;
            PhoneActionType phoneActionType2 = new PhoneActionType("CONFIRM", 1);
            f226785c = phoneActionType2;
            PhoneActionType phoneActionType3 = new PhoneActionType("CONFIRM_WITH_CODE_REQUEST", 2);
            f226786d = phoneActionType3;
            PhoneActionType phoneActionType4 = new PhoneActionType("CONFIRM_LANDLINE", 3);
            f226787e = phoneActionType4;
            PhoneActionType phoneActionType5 = new PhoneActionType("CUSTOM_ACTION", 4);
            f226788f = phoneActionType5;
            PhoneActionType[] phoneActionTypeArr = {phoneActionType, phoneActionType2, phoneActionType3, phoneActionType4, phoneActionType5};
            f226789g = phoneActionTypeArr;
            f226790h = c.a(phoneActionTypeArr);
        }

        public PhoneActionType() {
            throw null;
        }

        public static PhoneActionType valueOf(String str) {
            return (PhoneActionType) Enum.valueOf(PhoneActionType.class, str);
        }

        public static PhoneActionType[] values() {
            return (PhoneActionType[]) f226789g.clone();
        }
    }

    /* compiled from: PhoneActionActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/PhoneActionActivity$a;", "", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhoneActionActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PhoneActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PhoneActionType phoneActionType = PhoneActionType.f226784b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PhoneActionType phoneActionType2 = PhoneActionType.f226784b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PhoneActionType phoneActionType3 = PhoneActionType.f226784b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PhoneActionType phoneActionType4 = PhoneActionType.f226784b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.phone_action_root;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        Object serializableExtra;
        Fragment confirmPhoneFragment;
        super.onCreate(bundle);
        Fragment fragmentH = getSupportFragmentManager().H("tag.phone_action");
        if (fragmentH == null) {
            Intent intent = getIntent();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 33) {
                serializableExtra = intent.getSerializableExtra("key.action_type", PhoneActionType.class);
            } else {
                Object serializableExtra2 = intent.getSerializableExtra("key.action_type");
                if (!(serializableExtra2 instanceof PhoneActionType)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (PhoneActionType) serializableExtra2;
            }
            PhoneActionType phoneActionType = (PhoneActionType) serializableExtra;
            if (phoneActionType != null) {
                int iOrdinal = phoneActionType.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        Intent intent2 = getIntent();
                        PhoneConfirmationArguments phoneConfirmationArguments = (PhoneConfirmationArguments) (i12 >= 33 ? (Parcelable) intent2.getParcelableExtra("key.arguments", PhoneConfirmationArguments.class) : intent2.getParcelableExtra("key.arguments"));
                        ConfirmPhoneFragment.f226969E0.getClass();
                        confirmPhoneFragment = new ConfirmPhoneFragment();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phone", phoneConfirmationArguments.f226996b);
                        bundle2.putBoolean("code_request_needed", false);
                        bundle2.putBoolean("phone_validation_needed", false);
                        bundle2.putInt("code_length", phoneConfirmationArguments.f226997c);
                        bundle2.putLong("timeout", phoneConfirmationArguments.f226998d);
                        bundle2.putString("src_code_confirmation", phoneConfirmationArguments.f226999e);
                        confirmPhoneFragment.setArguments(bundle2);
                    } else if (iOrdinal == 2) {
                        Intent intent3 = getIntent();
                        PhoneConfirmationWithCodeRequestArguments phoneConfirmationWithCodeRequestArguments = (PhoneConfirmationWithCodeRequestArguments) (i12 >= 33 ? (Parcelable) intent3.getParcelableExtra("key.arguments", PhoneConfirmationWithCodeRequestArguments.class) : intent3.getParcelableExtra("key.arguments"));
                        ConfirmPhoneFragment.f226969E0.getClass();
                        confirmPhoneFragment = new ConfirmPhoneFragment();
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("phone", phoneConfirmationWithCodeRequestArguments.f227000b);
                        bundle3.putBoolean("code_request_needed", true);
                        bundle3.putBoolean("phone_validation_needed", phoneConfirmationWithCodeRequestArguments.f227001c);
                        bundle3.putString("src_code_confirmation", phoneConfirmationWithCodeRequestArguments.f227002d);
                        confirmPhoneFragment.setArguments(bundle3);
                    } else if (iOrdinal == 3) {
                        Intent intent4 = getIntent();
                        LandlinePhoneVerificationArguments landlinePhoneVerificationArguments = (LandlinePhoneVerificationArguments) (i12 >= 33 ? (Parcelable) intent4.getParcelableExtra("key.arguments", LandlinePhoneVerificationArguments.class) : intent4.getParcelableExtra("key.arguments"));
                        LandlinePhoneVerificationFragment.f227160z0.getClass();
                        confirmPhoneFragment = new LandlinePhoneVerificationFragment();
                        Bundle bundle4 = new Bundle();
                        bundle4.putInt("arg_call_id", landlinePhoneVerificationArguments.f227154b);
                        bundle4.putString("arg_title", landlinePhoneVerificationArguments.f227155c);
                        bundle4.putString("arg_subtitle", landlinePhoneVerificationArguments.f227156d);
                        bundle4.putParcelable("arg_description", landlinePhoneVerificationArguments.f227157e);
                        bundle4.putString("arg_phone", landlinePhoneVerificationArguments.f227158f);
                        bundle4.putBoolean("arg_is_manual", landlinePhoneVerificationArguments.f227159g);
                        confirmPhoneFragment.setArguments(bundle4);
                    } else {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Intent intent5 = getIntent();
                        PhoneActionArguments phoneActionArguments = (PhoneActionArguments) (i12 >= 33 ? (Parcelable) intent5.getParcelableExtra("key.arguments", PhoneActionArguments.class) : intent5.getParcelableExtra("key.arguments"));
                        PhoneActionFragment.f227250u0.getClass();
                        confirmPhoneFragment = new PhoneActionFragment();
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("phone", phoneActionArguments.f227246b);
                        Integer num = phoneActionArguments.f227248d;
                        if (num != null) {
                            bundle5.putInt("adverts_number", num.intValue());
                        }
                        bundle5.putParcelable("phone_action", phoneActionArguments.f227247c);
                        G.e("phones_for_replacement", bundle5, phoneActionArguments.f227249e);
                        confirmPhoneFragment.setArguments(bundle5);
                    }
                    fragmentH = confirmPhoneFragment;
                } else {
                    Intent intent6 = getIntent();
                    AddPhoneArguments addPhoneArguments = (AddPhoneArguments) (i12 >= 33 ? (Parcelable) intent6.getParcelableExtra("key.arguments", AddPhoneArguments.class) : intent6.getParcelableExtra("key.arguments"));
                    AddPhoneFragment.a aVar = AddPhoneFragment.f226797F0;
                    String str = addPhoneArguments != null ? addPhoneArguments.f226793b : null;
                    String str2 = addPhoneArguments != null ? addPhoneArguments.f226794c : null;
                    String str3 = addPhoneArguments != null ? addPhoneArguments.f226795d : null;
                    String str4 = addPhoneArguments != null ? addPhoneArguments.f226796e : null;
                    aVar.getClass();
                    fragmentH = AddPhoneFragment.a.a(str, str2, str3, str4);
                }
            } else {
                fragmentH = null;
            }
        }
        if (fragmentH == null) {
            finish();
            return;
        }
        H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.phone_fragment_container, fragmentH, "tag.phone_action");
        hE2.e();
    }
}

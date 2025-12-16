package com.avito.android.beduin.ui.universal;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.ui.universal.UniversalBeduinFragment;
import com.avito.android.deep_linking.links.BottomSheetContentPaddings;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.deep_linking.links.ThemeMode;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.C35974x2;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BaseUniversalBeduinActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/ui/universal/a;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "Lcom/avito/android/beduin/ui/universal/UniversalBeduinActivity;", "Lcom/avito/android/beduin/ui/universal/UniversalBeduinBottomSheetActivity;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class a extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: BaseUniversalBeduinActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.ui.universal.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3121a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104452a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f104453b;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f104452a = iArr;
            int[] iArr2 = new int[ScreenStyle.values().length];
            try {
                iArr2[ScreenStyle.BOTTOM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ScreenStyle.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f104453b = iArr2;
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    @Y61.k
    public static UniversalBeduinFragment a2(@Y61.k Intent intent) {
        Integer num;
        Integer num2;
        Integer numValueOf;
        Serializable serializableExtra = intent.getSerializableExtra(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE);
        Integer numValueOf2 = null;
        ScreenStyle screenStyle = serializableExtra instanceof ScreenStyle ? (ScreenStyle) serializableExtra : null;
        Long lC2 = C35974x2.c(intent, "contentId");
        String stringExtra = intent.getStringExtra(ContextActionHandler.Link.URL);
        String stringExtra2 = intent.getStringExtra("screenName");
        String stringExtra3 = intent.getStringExtra(BeduinPromoBlockModel.SERIALIZED_NAME_THEME);
        Serializable serializableExtra2 = intent.getSerializableExtra("bottomSheetContentPadding");
        BottomSheetContentPaddings bottomSheetContentPaddings = serializableExtra2 instanceof BottomSheetContentPaddings ? (BottomSheetContentPaddings) serializableExtra2 : null;
        if (lC2 == null && stringExtra == null) {
            throw new IllegalStateException("Url or contentId must not be null!");
        }
        int i12 = screenStyle == null ? -1 : C3121a.f104453b[screenStyle.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                numValueOf2 = Integer.valueOf(R.color.common_black);
                numValueOf = Integer.valueOf(R.drawable.common_ic_arrow_back_24);
            } else {
                numValueOf = Integer.valueOf(R.drawable.ic_close_24);
            }
            num = numValueOf;
            num2 = numValueOf2;
        } else {
            num = null;
            num2 = null;
        }
        UniversalBeduinFragment.a aVar = UniversalBeduinFragment.f104416B0;
        BeduinComponentTheme.f100605c.getClass();
        BeduinComponentTheme beduinComponentThemeA = BeduinComponentTheme.a.a(stringExtra3);
        if (bottomSheetContentPaddings == null) {
            bottomSheetContentPaddings = BottomSheetContentPaddings.TOP;
        }
        UniversalBeduinFragment.Params params = new UniversalBeduinFragment.Params(lC2, stringExtra, num, num2, screenStyle, beduinComponentThemeA, stringExtra2, bottomSheetContentPaddings);
        aVar.getClass();
        UniversalBeduinFragment universalBeduinFragment = new UniversalBeduinFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_params", params);
        universalBeduinFragment.setArguments(bundle);
        return universalBeduinFragment;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        Serializable serializableExtra = getIntent().getSerializableExtra(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE);
        ScreenStyle screenStyle = serializableExtra instanceof ScreenStyle ? (ScreenStyle) serializableExtra : null;
        super.onCreate(bundle);
        setContentView(R.layout.beduin_activity);
        if (bundle == null) {
            if (screenStyle != ScreenStyle.PUSH_BOTTOM_SHEET) {
                UniversalBeduinFragment universalBeduinFragmentA2 = a2(getIntent());
                H hE2 = getSupportFragmentManager().e();
                hE2.n(R.id.fragment_container, universalBeduinFragmentA2, null);
                hE2.e();
            } else {
                Long lC2 = C35974x2.c(getIntent(), "contentId");
                String stringExtra = getIntent().getStringExtra(ContextActionHandler.Link.URL);
                String stringExtra2 = getIntent().getStringExtra("screenName");
                String stringExtra3 = getIntent().getStringExtra(BeduinPromoBlockModel.SERIALIZED_NAME_THEME);
                UniversalBeduinPushBottomSheetDialog.f104450h0.getClass();
                UniversalBeduinPushBottomSheetDialog universalBeduinPushBottomSheetDialog = new UniversalBeduinPushBottomSheetDialog();
                Bundle bundleB = C22777e.b(new Q(ContextActionHandler.Link.URL, stringExtra));
                if (lC2 != null) {
                    bundleB.putLong("contentId", lC2.longValue());
                }
                if (stringExtra2 != null) {
                    bundleB.putString("screenName", stringExtra2);
                }
                if (stringExtra3 != null) {
                    bundleB.putString(BeduinPromoBlockModel.SERIALIZED_NAME_THEME, stringExtra3);
                }
                universalBeduinPushBottomSheetDialog.setArguments(bundleB);
                universalBeduinPushBottomSheetDialog.show(getSupportFragmentManager(), "push_dialog");
            }
            Serializable serializableExtra2 = getIntent().getSerializableExtra("themeMode");
            ThemeMode themeMode = serializableExtra2 instanceof ThemeMode ? (ThemeMode) serializableExtra2 : null;
            if (themeMode != null) {
                androidx.appcompat.app.p delegate = getDelegate();
                int i12 = C3121a.f104452a[themeMode.ordinal()];
                int i13 = 1;
                if (i12 != 1) {
                    i13 = 2;
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                delegate.E(i13);
            }
        }
        getWindow().setSoftInputMode(16);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        FragmentManager childFragmentManager;
        super.onNewIntent(intent);
        UniversalBeduinFragment universalBeduinFragmentA2 = a2(intent);
        Fragment fragmentH = getSupportFragmentManager().H("push_dialog");
        if (fragmentH == null || (childFragmentManager = fragmentH.getChildFragmentManager()) == null) {
            return;
        }
        H hE2 = childFragmentManager.e();
        hE2.n(R.id.fragment_container, universalBeduinFragmentA2, null);
        hE2.c(String.valueOf(universalBeduinFragmentA2.hashCode()));
        hE2.e();
    }

    private a() {
    }
}

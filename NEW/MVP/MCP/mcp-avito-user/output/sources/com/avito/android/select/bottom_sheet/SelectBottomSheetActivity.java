package com.avito.android.select.bottom_sheet;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.select.Arguments;
import com.avito.android.select.ResetResult;
import com.avito.android.select.SelectResult;
import com.avito.android.select.p;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectBottomSheetActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/bottom_sheet/SelectBottomSheetActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/select/p;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectBottomSheetActivity extends com.avito.android.ui.activity.a implements p, InterfaceC28477j.b {
    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        setResult(-1, new Intent().putExtra("select_result", new SelectResult(str, list, str2)));
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("select_arguments", Arguments.class) : intent.getParcelableExtra("select_arguments");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("select_arguments required");
            }
            c.a(null, (Arguments) parcelableExtra).show(getSupportFragmentManager(), "select_bottom_sheet_tag");
        }
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
        setResult(0);
        finish();
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
        Intent intent = new Intent();
        intent.putExtra("extra_clear_result", new ResetResult(str));
        G0 g02 = G0.f406611a;
        setResult(-1, intent);
        finish();
    }
}

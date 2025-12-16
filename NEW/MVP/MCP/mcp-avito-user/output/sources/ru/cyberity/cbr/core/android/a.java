package ru.cyberity.cbr.core.android;

import Y61.k;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.l;
import com.avito.android.inline_filters.dialog.calendar.DialogInterfaceOnCancelListenerC31002b;
import com.avito.android.item_map.view.U;
import com.avito.android.location_list.DialogInterfaceOnClickListenerC31516j;
import kotlin.G0;
import kotlin.Metadata;
import pY0.C47034b;
import ru.cyberity.cbr.core.common.s;

/* compiled from: CBRPermissionDialogBuilder.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/android/a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "message", "settingsButton", "cancelButton", "Lkotlin/Function0;", "Lkotlin/G0;", "onCancelCallback", "onPositiveCallback", "Landroidx/appcompat/app/l;", "a", "(Landroid/app/Activity;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;LY41/a;LY41/a;)Landroidx/appcompat/app/l;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f432580a = new a();

    private a() {
    }

    @k
    public final l a(@k Activity activity, @Y61.l CharSequence message, @Y61.l CharSequence settingsButton, @Y61.l CharSequence cancelButton, @Y61.l Y41.a<G0> onCancelCallback, @Y61.l Y41.a<G0> onPositiveCallback) {
        return new C47034b(activity).setMessage(message).setNegativeButton(cancelButton, (DialogInterface.OnClickListener) new DialogInterfaceOnClickListenerC31516j(1, onCancelCallback)).setPositiveButton(settingsButton, (DialogInterface.OnClickListener) new U(2, onPositiveCallback, activity)).setOnCancelListener((DialogInterface.OnCancelListener) new DialogInterfaceOnCancelListenerC31002b(12, onCancelCallback)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y41.a aVar, DialogInterface dialogInterface, int i12) {
        dialogInterface.dismiss();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y41.a aVar, Activity activity, DialogInterface dialogInterface, int i12) {
        dialogInterface.dismiss();
        if (aVar != null) {
            aVar.invoke();
        } else {
            s.a(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y41.a aVar, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        if (aVar != null) {
            aVar.invoke();
        }
    }
}

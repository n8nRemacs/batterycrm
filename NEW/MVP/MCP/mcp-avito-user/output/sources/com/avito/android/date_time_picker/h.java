package com.avito.android.date_time_picker;

import android.app.Activity;
import com.avito.android.date_time_picker.TimePickerDialogFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.payment.form.InterfaceC33009l;
import com.avito.android.phone_confirmation.a0;
import com.avito.android.photo_list_view.O;
import com.avito.android.photo_list_view.ViewAction;
import com.avito.android.util.K2;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class h implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f132675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f132676c;

    public /* synthetic */ h(Object obj, int i12) {
        this.f132675b = i12;
        this.f132676c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.avito.android.date_time_picker.TimePickerDialogFragment$Result$Success] */
    @Override // l41.g
    public final void accept(Object obj) {
        Object obj2 = this.f132676c;
        switch (this.f132675b) {
            case 0:
                TimePickerDialogFragment.a aVar = TimePickerDialogFragment.f132645j0;
                ((l0.h) obj2).f406842b = new TimePickerDialogFragment.Result.Success((org.threeten.bp.f) obj);
                break;
            case 1:
                ((InterfaceC33009l) ((h31.e) obj2).get()).c().invoke((com.avito.android.payment.items.phone_item.g) obj);
                break;
            case 2:
                int i12 = ((Boolean) obj).booleanValue() ? -1 : 0;
                Activity activity = ((a0) obj2).f215895a;
                activity.setResult(i12);
                K2.c(activity);
                activity.finish();
                break;
            default:
                ViewAction viewAction = (ViewAction) obj;
                O o12 = (O) obj2;
                DeepLink deepLink = (DeepLink) o12.f218105d.get(viewAction);
                if (deepLink != null) {
                    b.a.a(o12.f218102a, deepLink, null, null, 6);
                    break;
                } else {
                    o12.f218103b.c(new cc.g(new NullPointerException(), "Deeplink for view action " + viewAction + " not found"));
                    break;
                }
        }
    }
}

package com.avito.android.publish.objects;

import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ObjectFillFormRouter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/u;", "Lcom/avito/android/publish/objects/t;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.objects.u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33972u implements InterfaceC33971t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f238101a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Q1 f238102b;

    @Inject
    public C33972u(@Y61.k FragmentManager fragmentManager, @Y61.k Q1 q12) {
        this.f238101a = fragmentManager;
        this.f238102b = q12;
    }

    @Override // com.avito.android.publish.objects.InterfaceC33971t
    public final void a(@Y61.k String str, @Y61.l Integer num, @Y61.l ObjectFillFormScreenParams.SelectedValue selectedValue, boolean z12, boolean z13) {
        Fragment objectFillFormFragment;
        Q1 q12 = this.f238102b;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[70];
        if (((Boolean) q12.f67487g0.a().invoke()).booleanValue()) {
            objectFillFormFragment = new com.avito.android.publish.screen.objects.ObjectFillFormFragment();
            objectFillFormFragment.setArguments(C22777e.b(new kotlin.Q("object_fill_form_screen_params_key", new ObjectFillFormScreenParams(str, num, selectedValue)), new kotlin.Q("isEdit", Boolean.valueOf(z13)), new kotlin.Q("isPriceList", Boolean.valueOf(z12))));
        } else {
            ObjectFillFormScreenParams objectFillFormScreenParams = new ObjectFillFormScreenParams(str, num, selectedValue);
            ObjectFillFormFragment objectFillFormFragment2 = new ObjectFillFormFragment();
            objectFillFormFragment2.setArguments(C22777e.b(new kotlin.Q("object_fill_form_screen_params_key", objectFillFormScreenParams), new kotlin.Q("isEdit", Boolean.valueOf(z13)), new kotlin.Q("isPriceList", Boolean.valueOf(z12))));
            objectFillFormFragment = objectFillFormFragment2;
        }
        androidx.fragment.app.H hE2 = this.f238101a.e();
        hE2.n(R.id.fragment_container, objectFillFormFragment, "object_fill_form_fragment_tag");
        hE2.c("object_fill_form_fragment_tag");
        hE2.e();
    }

    @Override // com.avito.android.publish.objects.InterfaceC33971t
    public final void i0() {
        this.f238101a.Y();
    }
}

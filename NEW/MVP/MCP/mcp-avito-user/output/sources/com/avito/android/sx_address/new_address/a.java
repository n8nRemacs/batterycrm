package com.avito.android.sx_address.new_address;

import Y41.l;
import android.content.Intent;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.sx_address.SxAddressAddResult;
import com.avito.android.sx_address.SxAddressControl;
import com.avito.android.sx_address.SxAddressEditParams;
import com.avito.android.sx_address.SxAddressEditResult;
import com.avito.android.sx_address.SxNewAddressOpenParams;
import com.avito.android.sx_address.new_address.SxNewAddressFragment;
import com.avito.android.sx_address.new_address.mvi.C;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviViewState;
import com.avito.android.sx_address.new_address.view.o;
import com.avito.android.sx_address.new_address.view.r;
import com.avito.android.user_address.deeplink.k;
import java.util.Iterator;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.l0;
import kotlin.text.C43066x;

/* compiled from: SxNewAddressFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class a extends H implements l<C, G0> {
    @Override // Y41.l
    public final G0 invoke(C c12) {
        Intent intentH;
        Throwable th2;
        String message;
        int i12 = 0;
        int i13 = 1;
        C c13 = c12;
        SxNewAddressFragment sxNewAddressFragment = (SxNewAddressFragment) this.receiver;
        SxNewAddressFragment.a aVar = SxNewAddressFragment.f293548w0;
        sxNewAddressFragment.getClass();
        if (c13 instanceof C.b) {
            r rVar = sxNewAddressFragment.f293557v0;
            if (rVar != null) {
                rVar.c(((C.b) c13).f293700a);
            }
        } else if (c13 instanceof C.e) {
            r rVar2 = sxNewAddressFragment.f293557v0;
            if (rVar2 != null) {
                C.e eVar = (C.e) c13;
                rVar2.f(eVar.f293703a, eVar.f293704b);
            }
        } else if (c13 instanceof C.g) {
            r rVar3 = sxNewAddressFragment.f293557v0;
            if (rVar3 != null) {
                SxNewAddressMviViewState.ValidationError validationError = ((C.g) c13).f293705a;
                NestedScrollView nestedScrollView = rVar3.f293944n;
                if (validationError != null) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(validationError.f293747a.f293748b);
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, rVar3.f293945o, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4014);
                    nestedScrollView.post(new o(rVar3, i13));
                }
                l0.a aVar2 = new l0.a();
                Iterator it = rVar3.f293942l.f293891d.entrySet().iterator();
                while (it.hasNext()) {
                    aVar2.f406838b = ((Boolean) ((Y41.a) ((Map.Entry) it.next()).getValue()).invoke()).booleanValue();
                }
                nestedScrollView.post(new RunnableC34589p(15, aVar2, rVar3));
                nestedScrollView.post(new o(rVar3, i12));
                nestedScrollView.post(new o(rVar3, 2));
                nestedScrollView.post(new o(rVar3, 3));
            }
        } else if (c13 instanceof C.d) {
            r rVar4 = sxNewAddressFragment.f293557v0;
            if (rVar4 != null && (th2 = ((C.d) c13).f293702a) != null && (message = th2.getMessage()) != null) {
                Button button = rVar4.f293945o;
                button.setLoading(false);
                button.setClickable(true);
                com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF2 = com.avito.android.printable_text.b.f(message);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar2, rVar4.f293945o, printableTextF2, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4014);
            }
        } else {
            SxAddressAddResult.Success.PublishValue publishValue = null;
            if (c13 instanceof C.f) {
                r rVar5 = sxNewAddressFragment.f293557v0;
                if (rVar5 != null) {
                    rVar5.e(null);
                    throw null;
                }
            } else if (c13 instanceof C.a) {
                sxNewAddressFragment.requireActivity().finish();
            } else if (c13 instanceof C.c) {
                SxAddressControl sxAddressControl = sxNewAddressFragment.f293551p0;
                if (sxAddressControl == null) {
                    sxAddressControl = null;
                }
                if (sxAddressControl instanceof SxAddressEditParams) {
                    k kVar = sxNewAddressFragment.f293549n0;
                    SxAddressEditParams sxAddressEditParams = (SxAddressEditParams) sxAddressControl;
                    (kVar != null ? kVar : null).c((int) sxAddressEditParams.f292534d, sxAddressEditParams.f292536f, sxAddressEditParams.f292535e, sxAddressEditParams.f292532b, ((C.c) c13).f293701a);
                } else if (sxAddressControl instanceof SxNewAddressOpenParams) {
                    C.c cVar3 = (C.c) c13;
                    String str = cVar3.f293701a;
                    if (str == null || C43066x.K(str)) {
                        k kVar2 = sxNewAddressFragment.f293549n0;
                        SxNewAddressOpenParams sxNewAddressOpenParams = (SxNewAddressOpenParams) sxAddressControl;
                        intentH = (kVar2 != null ? kVar2 : null).h(sxNewAddressOpenParams.f292548b, sxNewAddressOpenParams.f292552f, str, sxNewAddressOpenParams.f292553g);
                    } else {
                        k kVar3 = sxNewAddressFragment.f293549n0;
                        k kVar4 = kVar3 != null ? kVar3 : null;
                        SxNewAddressOpenParams sxNewAddressOpenParams2 = (SxNewAddressOpenParams) sxAddressControl;
                        String str2 = sxNewAddressOpenParams2.f292548b;
                        SxNewAddressOpenParams.Address address = sxNewAddressOpenParams2.f292551e;
                        intentH = kVar4.i(str2, sxNewAddressOpenParams2.f292552f, cVar3.f293701a, address.f292555c.getLongitude(), address.f292555c.getLatitude(), sxNewAddressOpenParams2.f292553g);
                    }
                    intentH.addFlags(1073741824);
                    sxNewAddressFragment.startActivity(intentH);
                }
            } else if (c13 instanceof C.h) {
                ActivityC22955m activityC22955mRequireActivity = sxNewAddressFragment.requireActivity();
                Intent intent = new Intent();
                C.h hVar = (C.h) c13;
                FA0.f fVar = hVar.f293707b;
                if (fVar != null) {
                    publishValue = new SxAddressAddResult.Success.PublishValue(fVar.getJwt(), fVar.getLat(), fVar.getLng(), fVar.getText(), fVar.getSellerAddressData() != null ? new SxAddressAddResult.Success.AddressData(fVar.getSellerAddressData().getHouse(), fVar.getSellerAddressData().getId(), fVar.getSellerAddressData().getIsDisabled(), fVar.getSellerAddressData().getLocation(), fVar.getSellerAddressData().getName()) : null);
                }
                intent.putExtra("result.sx_address.add", new SxAddressAddResult.Success(hVar.f293706a, publishValue));
                G0 g02 = G0.f406611a;
                activityC22955mRequireActivity.setResult(-1, intent);
            } else if (c13 instanceof C.i) {
                ActivityC22955m activityC22955mRequireActivity2 = sxNewAddressFragment.requireActivity();
                Intent intent2 = new Intent();
                intent2.putExtra("result.sx_address.edit", new SxAddressEditResult.Success(((C.i) c13).f293708a));
                G0 g03 = G0.f406611a;
                activityC22955mRequireActivity2.setResult(-1, intent2);
            }
        }
        return G0.f406611a;
    }
}

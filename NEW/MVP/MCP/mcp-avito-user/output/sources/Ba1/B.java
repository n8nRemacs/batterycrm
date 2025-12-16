package Ba1;

import Fc1.C13598e1;
import Fc1.C13607f1;
import Fc1.O0;
import Fc1.T1;
import Ui.InterfaceC15523b;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IInterface;
import android.os.Trace;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.Config;
import androidx.compose.foundation.text.g3;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.core.view.M;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23107s;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.V;
import androidx.media3.common.X;
import androidx.media3.common.util.r;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.analytics.b;
import androidx.media3.exoplayer.source.C23171w;
import androidx.view.C23038g0;
import androidx.view.dynamicfeatures.j;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.work.L;
import androidx.work.multiprocess.InterfaceC23620a;
import androidx.work.multiprocess.InterfaceC23629j;
import androidx.work.multiprocess.RemoteListenableDelegatingWorker;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import com.avito.android.R;
import com.avito.android.ab_groups.AbExperimentsActivity;
import com.avito.android.avito_map.yandex.AvitoYandexMap;
import com.avito.android.beduin.common.component.checkbox.BeduinCheckboxModel;
import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import com.avito.android.beduin.common.component.checkbox.a;
import com.avito.android.beduin.common.component.checkbox_list_item.BeduinCheckboxListItemModel;
import com.avito.android.beduin.common.component.checkbox_list_item.a;
import com.avito.android.beduin.common.utils.C28806b;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet.BottomSheetScreenFragment;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.remote.model.toolbar_download.AdvertDetailsDownloadFileInfoResponse;
import com.avito.android.remote.model.validation.Structure;
import com.avito.android.util.C35966w1;
import com.avito.android.util.P2;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.play.core.splitinstall.AbstractC37204f;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.MapObject;
import gF.InterfaceC40577a;
import iF.InterfaceC41277a;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.InterfaceC41770c;
import io.reactivex.rxjava3.core.InterfaceC41772e;
import io.reactivex.rxjava3.core.K;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import kotlinx.coroutines.channels.I0;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import pi.C47093d;
import ru.rustore.sdk.reactive.single.AbstractC47905a;
import ru.rustore.sdk.reactive.single.C47909e;
import ru.rustore.sdk.review.model.ReviewInfo;
import ub1.C49023e;
import xyz.n.a.ke;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class B implements M, Config.b, com.google.firebase.components.f, io.reactivex.rxjava3.core.M, g3, r.a, r.b, InterfaceC37023f, Consumer, InterfaceC23629j, Toolbar.h, InterfaceC41772e, ru.rustore.sdk.core.tasks.e, io.reactivex.rxjava3.core.C, Callback, JV.b, InterfaceC41277a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1488c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1489d;

    public /* synthetic */ B(int i12, Object obj, Object obj2) {
        this.f1487b = i12;
        this.f1488c = obj;
        this.f1489d = obj2;
    }

    @Override // com.google.firebase.components.f
    public Object a(com.google.firebase.components.c cVar) {
        String str = (String) this.f1488c;
        com.google.firebase.components.b bVar = (com.google.firebase.components.b) this.f1489d;
        try {
            Trace.beginSection(str);
            return bVar.f360730f.a(cVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.window.extensions.core.util.function.Consumer
    public void accept(Object obj) {
        androidx.window.area.k.b((androidx.window.area.k) this.f1488c, ((Integer) obj).intValue());
        throw null;
    }

    @Override // JV.b
    public void b(State state) {
        Object obj = this.f1489d;
        Object obj2 = this.f1488c;
        switch (this.f1487b) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                a.C3029a c3029a = com.avito.android.beduin.common.component.checkbox.a.f100928h;
                int iOrdinal = state.ordinal();
                com.avito.android.beduin.common.component.checkbox.a aVar = (com.avito.android.beduin.common.component.checkbox.a) obj;
                InterfaceC15523b<BeduinAction> interfaceC15523b = aVar.f100932f;
                BeduinCheckboxModel beduinCheckboxModel = (BeduinCheckboxModel) obj2;
                if (iOrdinal == 0) {
                    List<BeduinAction> onCheckedActions = beduinCheckboxModel.getOnCheckedActions();
                    if (onCheckedActions != null) {
                        C28806b.a(interfaceC15523b, onCheckedActions);
                    }
                    aVar.u(CheckboxState.CHECKED);
                    break;
                } else if (iOrdinal == 1) {
                    List<BeduinAction> onUncheckedActions = beduinCheckboxModel.getOnUncheckedActions();
                    if (onUncheckedActions != null) {
                        C28806b.a(interfaceC15523b, onUncheckedActions);
                    }
                    aVar.u(CheckboxState.UNCHECKED);
                    break;
                } else if (iOrdinal == 2) {
                    aVar.u(CheckboxState.INDETERMINATE);
                    break;
                }
                break;
            default:
                a.C3030a c3030a = com.avito.android.beduin.common.component.checkbox_list_item.a.f100972k;
                int iOrdinal2 = state.ordinal();
                com.avito.android.beduin.common.component.checkbox_list_item.a aVar2 = (com.avito.android.beduin.common.component.checkbox_list_item.a) obj2;
                InterfaceC15523b<BeduinAction> interfaceC15523b2 = aVar2.f100976f;
                BeduinCheckboxListItemModel beduinCheckboxListItemModel = (BeduinCheckboxListItemModel) obj;
                if (iOrdinal2 == 0) {
                    com.avito.android.beduin_shared.model.utils.a.a(interfaceC15523b2, beduinCheckboxListItemModel.getOnCheckedActions());
                    aVar2.p(CheckboxState.CHECKED);
                    break;
                } else if (iOrdinal2 == 1) {
                    com.avito.android.beduin_shared.model.utils.a.a(interfaceC15523b2, beduinCheckboxListItemModel.getOnUncheckedActions());
                    aVar2.p(CheckboxState.UNCHECKED);
                    break;
                } else if (iOrdinal2 == 2) {
                    aVar2.p(CheckboxState.INDETERMINATE);
                    break;
                }
                break;
        }
    }

    @Override // androidx.media3.common.util.r.b
    public void c(Object obj, C23107s c23107s) {
        ((androidx.media3.exoplayer.analytics.b) obj).m((androidx.media3.common.H) this.f1489d, new b.c(c23107s, ((androidx.media3.exoplayer.analytics.p) this.f1488c).f48690f));
    }

    @Override // iF.InterfaceC41277a
    public void d(int i12) {
        BottomSheetScreenFragment.a aVar = BottomSheetScreenFragment.f104149R0;
        BottomSheetScreenFragment bottomSheetScreenFragment = (BottomSheetScreenFragment) this.f1488c;
        InterfaceC40577a interfaceC40577a = bottomSheetScreenFragment.f104120o0;
        if (interfaceC40577a == null) {
            interfaceC40577a = null;
        }
        C35966w1.d(bottomSheetScreenFragment, interfaceC40577a.a(i12, ((C47093d) this.f1489d).b()), 1);
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41772e
    public void e(InterfaceC41770c interfaceC41770c) {
        H.c cVarB = ((io.reactivex.rxjava3.internal.schedulers.s) this.f1488c).b();
        L l12 = (L) this.f1489d;
        interfaceC41770c.f(new com.avito.android.app.work.a(0, l12, cVarB));
        l12.a().N(new com.avito.android.app.coldstart.d(interfaceC41770c, 3), new androidx.media3.exoplayer.audio.o(cVarB, 1));
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(io.reactivex.rxjava3.core.B b12) {
        com.avito.android.remote.error.f fVar = ((com.avito.android.async_phone.public_module.loading_helper.a) this.f1488c).f92239b;
        Throwable th2 = (Throwable) this.f1489d;
        b12.onNext(new P2.a(fVar.a(th2)));
        b12.onError(th2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // androidx.core.view.M
    public J0 h(View view, J0 j02) {
        C22771k c22771kE = j02.e(7);
        int i12 = c22771kE.f44778d;
        View view2 = (View) this.f1488c;
        boolean z12 = ((double) i12) / ((double) view2.getResources().getDisplayMetrics().heightPixels) > 0.25d;
        int i13 = z12 ? i12 : 0;
        Integer numValueOf = Integer.valueOf(c22771kE.f44776b);
        if (z12) {
            i12 = 0;
        }
        ((N) this.f1489d).invoke(numValueOf, Integer.valueOf(i12));
        C22771k c22771kB = C22771k.b(0, 0, 0, i13);
        J0.b bVar = new J0.b();
        bVar.b(1, c22771kB);
        return C22823h0.v(view2, bVar.a());
    }

    @Override // androidx.work.multiprocess.InterfaceC23629j
    public void i(IInterface iInterface, androidx.work.multiprocess.m mVar) {
        ((InterfaceC23620a) iInterface).o1(mVar, androidx.work.multiprocess.parcelable.a.a(new ParcelableRemoteWorkRequest((String) this.f1488c, ((RemoteListenableDelegatingWorker) this.f1489d).f56107b)));
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        androidx.media3.exoplayer.analytics.b bVar = (androidx.media3.exoplayer.analytics.b) obj;
        switch (this.f1487b) {
            case 5:
                bVar.d((b.C1823b) this.f1488c, (Exception) this.f1489d);
                break;
            case 6:
                bVar.F((b.C1823b) this.f1488c, (androidx.media3.common.G) this.f1489d);
                break;
            case 7:
                bVar.j((b.C1823b) this.f1488c, (V) this.f1489d);
                break;
            case 8:
                bVar.l((b.C1823b) this.f1488c, (C23171w) this.f1489d);
                break;
            case 9:
                bVar.K((b.C1823b) this.f1488c, (C23138g) this.f1489d);
                break;
            case 10:
                bVar.w((b.C1823b) this.f1488c, (C23091e) this.f1489d);
                break;
            case 11:
                bVar.q((b.C1823b) this.f1488c, (Metadata) this.f1489d);
                break;
            case 12:
                bVar.J((b.C1823b) this.f1488c, (PlaybackException) this.f1489d);
                break;
            case 13:
                b.C1823b c1823b = (b.C1823b) this.f1488c;
                X x12 = (X) this.f1489d;
                bVar.k(c1823b, x12);
                int i12 = x12.f47555b;
                break;
            default:
                bVar.I((b.C1823b) this.f1488c, this.f1489d);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.M
    public void j(K k12) {
        Object obj = this.f1489d;
        Object obj2 = this.f1488c;
        switch (this.f1487b) {
            case 3:
                C13607f1 c13607f1 = (C13607f1) obj;
                T1 t12 = c13607f1.f5493a;
                c13607f1.a().a(new O0((Q) obj2, (t12 != null ? t12 : null).a(ke.POST_SCREENSHOTS), new C13598e1(k12, 0), new C13598e1(k12, 1)));
                return;
            case 20:
                com.avito.android.advert.advert_details_popup.b bVar = (com.avito.android.advert.advert_details_popup.b) obj2;
                HttpUrl httpUrl = HttpUrl.INSTANCE.parse(C43066x.X("/api", bVar.f68610b.a()).concat((String) obj));
                if (httpUrl != null) {
                    Response responseExecute = bVar.f68612d.get().newCall(new Request.Builder().get().url(httpUrl).build()).execute();
                    try {
                        if (responseExecute.isSuccessful()) {
                            ResponseBody responseBodyBody = responseExecute.body();
                            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                            if (strString != null) {
                                try {
                                    AdvertDetailsDownloadFileInfoResponse advertDetailsDownloadFileInfoResponse = (AdvertDetailsDownloadFileInfoResponse) bVar.f68609a.d(AdvertDetailsDownloadFileInfoResponse.class, strString);
                                    if (advertDetailsDownloadFileInfoResponse == null) {
                                        throw new IOException();
                                    }
                                    k12.onSuccess(advertDetailsDownloadFileInfoResponse);
                                } catch (Exception e12) {
                                    k12.g(e12);
                                }
                            } else {
                                k12.g(new Exception("Empty response body"));
                            }
                        } else {
                            k12.g(new Exception("HTTP " + responseExecute.code() + ": " + responseExecute.message()));
                        }
                        responseExecute.close();
                        G0 g02 = G0.f406611a;
                        kotlin.io.c.a(responseExecute, null);
                        return;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            kotlin.io.c.a(responseExecute, th2);
                            throw th3;
                        }
                    }
                }
                return;
            default:
                try {
                    k12.onSuccess(((com.avito.android.evidence_request.details.validation.i) obj2).f148574b.a((Structure) obj));
                    return;
                } catch (Throwable th4) {
                    k12.g(th4);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC37023f
    public void onFailure(Exception exc) {
        j.a aVar = androidx.view.dynamicfeatures.j.f53089c;
        exc.getMessage();
        AbstractC37204f abstractC37204fB = AbstractC37204f.b(0, 6, exc instanceof SplitInstallException ? ((SplitInstallException) exc).f348894b.f348905b : -100, 0L, 0L, Collections.singletonList((String) this.f1488c), C42784z0.f406748b);
        C23038g0 c23038g0 = (C23038g0) this.f1489d;
        c23038g0.setValue(abstractC37204fB);
        androidx.view.dynamicfeatures.j.f53089c.getClass();
        if (c23038g0.hasActiveObservers()) {
            throw new IllegalStateException("This DynamicInstallMonitor will not emit any more status updates. You should remove all Observers after null has been emitted.");
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        int i12 = AbExperimentsActivity.f67644v;
        if (menuItem.getItemId() != R.id.saveItem) {
            return false;
        }
        ((Toolbar) this.f1488c).requestFocus();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addFlags(268468224);
        intent.addCategory("android.intent.category.DEFAULT");
        AbExperimentsActivity abExperimentsActivity = (AbExperimentsActivity) this.f1489d;
        String packageName = abExperimentsActivity.getPackageName();
        Iterator<ResolveInfo> it = abExperimentsActivity.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo.packageName.equals(packageName)) {
                intent.setComponent(new ComponentName(packageName, activityInfo.name));
                Intent intent2 = new Intent(abExperimentsActivity, (Class<?>) ProcessPhoenix.class);
                intent2.addFlags(268435456);
                intent2.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList<>(Arrays.asList(intent)));
                abExperimentsActivity.startActivity(intent2);
                abExperimentsActivity.finish();
                Runtime.getRuntime().exit(0);
                return true;
            }
        }
        throw new IllegalStateException(AK.c.k("Unable to determine default activity for ", packageName, ". Does an activity specify the DEFAULT category in its intent filter?"));
    }

    @Override // ru.rustore.sdk.core.tasks.e
    public void onSuccess(Object obj) {
        ReviewInfo reviewInfo = (ReviewInfo) obj;
        ub1.E e12 = ((C49023e) this.f1488c).f440147a;
        e12.getClass();
        AbstractC47905a.C12588a c12588a = AbstractC47905a.f436968a;
        ub1.w wVar = new ub1.w(e12, reviewInfo);
        c12588a.getClass();
        AbstractC47905a abstractC47905aA = ru.rustore.sdk.reactive.single.t.a(new C47909e(wVar), new ub1.C(e12, reviewInfo));
        ru.rustore.sdk.reactive.core.d.f436864a.getClass();
        ru.rustore.sdk.core.tasks.f fVarA = ub1.j.a(ru.rustore.sdk.reactive.single.H.a(abstractC47905aA, ru.rustore.sdk.reactive.core.d.a()));
        I0 i02 = (I0) this.f1489d;
        fVarA.b(new com.avito.android.app_rater.interactor.o(i02, 2), null, null);
        fVarA.b(null, new com.avito.android.app_rater.interactor.o(i02, 3), null);
    }

    @Override // com.yandex.mapkit.map.Callback
    public void onTaskFinished() {
        AvitoYandexMap.removeMarker$lambda$42((MapObject) this.f1488c, (AvitoYandexMap) this.f1489d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ B(View view, Y41.p pVar) {
        this.f1487b = 0;
        this.f1488c = view;
        this.f1489d = (N) pVar;
    }

    public /* synthetic */ B(b.C1823b c1823b, Object obj, long j12) {
        this.f1487b = 14;
        this.f1488c = c1823b;
        this.f1489d = obj;
    }

    public /* synthetic */ B(String str, androidx.view.dynamicfeatures.l lVar, C23038g0 c23038g0) {
        this.f1487b = 16;
        this.f1488c = str;
        this.f1489d = c23038g0;
    }
}

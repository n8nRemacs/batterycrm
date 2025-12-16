package com.avito.android.advert.deeplinks.delivery;

import Jd0.C14188a;
import android.util.Base64;
import com.avito.android.advert.item.safedeal.V;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.inline_filters.C30997d;
import com.avito.android.messenger.conversation.mvi.send.D;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.recall_me.domain.RecallMeFormState;
import com.avito.android.recall_me.presentation.RecallMeParams;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.LeasingApplicationRequest;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.serp.adapter.vertical_main.publish.PublishAction;
import com.avito.android.universal_map.map.O;
import com.avito.android.user_advert.advert.G1;
import com.avito.android.util.A4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41992u0;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.P0;
import kotlin.text.C43047d;
import kotlin.text.C43066x;
import okhttp3.MultipartBody;
import t80.InterfaceC48515a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class p implements l41.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f68957c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f68958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f68959e;

    public /* synthetic */ p(com.avito.android.leasing_calculator.k kVar, LeasingApplicationRequest leasingApplicationRequest, String str) {
        this.f68956b = 9;
        this.f68958d = kVar;
        this.f68959e = leasingApplicationRequest;
        this.f68957c = str;
    }

    @Override // l41.s
    public final Object get() {
        Object obj = this.f68959e;
        Object obj2 = this.f68957c;
        Object obj3 = this.f68958d;
        switch (this.f68956b) {
            case 0:
                return ((q) obj3).f68960a.get().d((String) obj2, (String) obj);
            case 1:
                return ((V) obj3).f78773a.get().a((String) obj2, 1, null, null, A4.j(A4.f318516a, (Map) obj));
            case 2:
                return ((com.avito.android.advert.item.safedeal.real_one_click_payment_block.c) obj3).f78919a.get().c((String) obj2, (String) obj);
            case 3:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                return ((com.avito.android.beduin.common.g) obj).f103418a.get().d(C43066x.U("api/", (String) obj2), linkedHashMap != null ? A4.j(A4.f318516a, linkedHashMap) : P0.c());
            case 4:
                com.avito.android.beduin.common.component.photo_picker.data.a aVar = ((com.avito.android.beduin.common.component.photo_picker.data.d) obj3).f101963b.get();
                BeduinPhotoPickerModel.ImageUploadParams imageUploadParams = (BeduinPhotoPickerModel.ImageUploadParams) obj2;
                String strU = C43066x.U("api/", imageUploadParams.getPath());
                MultipartBody.Part partA = com.avito.http.b.a((File) obj, 3);
                Map<String, Object> mapD = imageUploadParams.d();
                if (mapD == null) {
                    mapD = P0.c();
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(mapD.size()));
                Iterator<T> it = mapD.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
                }
                return aVar.a(strU, partA, linkedHashMap2);
            case 5:
                return ((com.avito.android.bxcontent.garage.g) obj3).f111110a.get().b((String) obj2, (String) obj);
            case 6:
                C14188a c14188a = ((com.avito.android.computer_vision.c) obj3).f125445a;
                int i12 = Jd0.b.f9071a;
                return ((InterfaceC48515a) c14188a.f9070b).a((MultipartBody.Part) obj2, (MultipartBody.Part) obj);
            case 7:
                return ((com.avito.android.deal_confirmation.b) obj3).f132736a.get().b((String) obj2, (String) obj);
            case 8:
                WidgetType widgetType = (WidgetType) obj3;
                int i13 = widgetType == null ? -1 : C30997d.a.f171083a[widgetType.ordinal()];
                h31.e<V0> eVar = ((C30997d) obj2).f171080a;
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) obj;
                return i13 != 1 ? i13 != 2 ? eVar.get().n(linkedHashMap3) : eVar.get().e(linkedHashMap3) : eVar.get().d(linkedHashMap3);
            case 9:
                com.avito.android.leasing_calculator.k kVar = (com.avito.android.leasing_calculator.k) obj3;
                return kVar.f175103a.get().a((String) obj2, Base64.encodeToString(kVar.f175106d.l((LeasingApplicationRequest) obj).getBytes(C43047d.f410589b), 0)).F();
            case 10:
                D d12 = (D) obj3;
                io.reactivex.rxjava3.disposables.c cVar = d12.f194217t0;
                cVar.e();
                C41992u0 c41992u0A0 = z.a0(0L, 1L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
                com.jakewharton.rxrelay3.b<Long> bVar = d12.f194215r0;
                cVar.b(c41992u0A0.t0(bVar));
                SendMessagePresenter.VoiceRecorderState.RecordingInProgress recordingInProgress = new SendMessagePresenter.VoiceRecorderState.RecordingInProgress((File) obj);
                recordingInProgress.f194451c = bVar;
                return SendMessagePresenter.State.a((SendMessagePresenter.State) obj2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, recordingInProgress, false, null, null, Integer.MAX_VALUE, 7);
            case 11:
                RecallMeFormState recallMeFormState = (RecallMeFormState) obj;
                RecallMeParams recallMeParams = (RecallMeParams) obj2;
                return ((com.avito.android.recall_me.domain.h) obj3).f251837a.get().b(recallMeParams.f251909b, recallMeFormState.f251830b, "7".concat(recallMeFormState.f251831c), recallMeParams.f251911d, recallMeParams.f251910c);
            case 12:
                return ((com.avito.android.recall_me.domain.h) obj3).f251837a.get().a((String) obj2, (String) obj);
            case 13:
                return ((com.avito.android.recall_me_core.c) obj3).f252042a.get().c((String) obj2, (String) obj);
            case 14:
                PublishAction publishAction = (PublishAction) obj;
                return ((com.avito.android.serp.adapter.vertical_main.publish.d) obj3).f273087a.get().a((LinkedHashMap) obj2, publishAction.f273083d, publishAction.f273082c);
            case 15:
                return ((O) obj3).f304803a.get().d((String) obj2, A4.j(A4.f318516a, (Map) obj));
            case 16:
                return ((G1) obj3).f308235a.get().d((String) obj2, (String) obj);
            default:
                return ((com.avito.android.user_advert.advert.realty_verification.c) obj3).f310592a.get().k((String) obj2, (String) obj);
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i12) {
        this.f68956b = i12;
        this.f68958d = obj;
        this.f68957c = obj2;
        this.f68959e = obj3;
    }

    public /* synthetic */ p(String str, LinkedHashMap linkedHashMap, com.avito.android.beduin.common.g gVar) {
        this.f68956b = 3;
        this.f68957c = str;
        this.f68958d = linkedHashMap;
        this.f68959e = gVar;
    }
}

package com.avito.android.publish.slots.cv_upload;

import Bx0.InterfaceC13200a;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.cv_upload.Action;
import com.avito.android.remote.model.category_parameters.slot.cv_upload.CvUploadSlot;
import com.avito.android.remote.model.category_parameters.slot.cv_upload.CvUploadSlotConfig;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.o;

/* compiled from: CvUploadWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/cv_upload/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/CvUploadSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends k<CvUploadSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CvUploadSlot f243387b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13200a f243388c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f243389d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f243390e;

    /* compiled from: CvUploadWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "result", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.cv_upload.a$a, reason: collision with other inner class name */
    public static final class C7299a<T> implements g {
        public C7299a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a.this.f243390e = ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: CvUploadWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "apply", "(Z)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f243392b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Boolean) obj).booleanValue();
            return new P2.b(G0.f406611a);
        }
    }

    @i31.c
    public a(@InterfaceC41220a @Y61.k CvUploadSlot cvUploadSlot, @Y61.k C0 c02, @Y61.k InterfaceC13200a interfaceC13200a) {
        this.f243387b = cvUploadSlot;
        this.f243388c = interfaceC13200a;
        this.f243389d = c02.f231865c0;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243387b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        String str = this.f243389d;
        z<P2<G0>> zVarF = str != null ? this.f243388c.a(str).k(new C7299a()).r(b.f243392b).u(new C32102w0(15)).F() : null;
        return zVarF == null ? z.c0(new P2.b(G0.f406611a)) : zVarF;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        CvUploadSlot cvUploadSlot = this.f243387b;
        String str = this.f243389d;
        if (str == null) {
            return Collections.singletonList(new com.avito.android.publish.slots.cv_upload.item.cvUploadButton.c(cvUploadSlot.getId(), ((CvUploadSlotConfig) cvUploadSlot.getWidget().getConfig()).getButton().getText(), ((CvUploadSlotConfig) cvUploadSlot.getWidget().getConfig()).getButton().getDeeplink()));
        }
        if (!this.f243390e) {
            return C42784z0.f406748b;
        }
        String id2 = cvUploadSlot.getId();
        String title = ((CvUploadSlotConfig) cvUploadSlot.getWidget().getConfig()).getBanner().getTitle();
        List<Action> actions = ((CvUploadSlotConfig) cvUploadSlot.getWidget().getConfig()).getBanner().getActions();
        ArrayList arrayList = new ArrayList(C42745f0.q(actions, 10));
        Iterator<T> it = actions.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.avito.android.publish.slots.cv_upload.item.cv_upload_banner.a(((Action) it.next()).getText()));
        }
        List<com.avito.conveyor_item.a> listSingletonList = Collections.singletonList(new com.avito.android.publish.slots.cv_upload.item.cv_upload_banner.d(id2, title, arrayList));
        this.f243388c.c(str);
        return listSingletonList;
    }
}

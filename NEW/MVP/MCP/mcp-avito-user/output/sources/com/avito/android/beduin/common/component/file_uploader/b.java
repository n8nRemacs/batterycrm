package com.avito.android.beduin.common.component.file_uploader;

import Ag.CallableC13028a;
import Ui.InterfaceC15523b;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.file_uploader.file.FileItem;
import com.avito.android.beduin.common.component.file_uploader.k;
import com.avito.android.beduin.common.component.file_uploader.n;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.category_parameters.FileUploaderParameter;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.O2;
import i.b;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinFileUploaderComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/b;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/file_uploader/BeduinFileUploaderModel;", "Lcom/avito/android/beduin/common/component/file_uploader/k;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends com.avito.android.beduin.common.component.h<BeduinFileUploaderModel, k> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final a f101224k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final List<String> f101225l = Collections.singletonList(FileUploaderParameter.TYPE);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final Class<BeduinFileUploaderModel> f101226m = BeduinFileUploaderModel.class;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BeduinFileUploaderModel f101227e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f101228f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final lj.e f101229g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final n f101230h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final BeduinFileUploaderModel f101231i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public androidx.view.result.h<String[]> f101232j;

    /* compiled from: BeduinFileUploaderComponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/b$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "", "DEFAULT_TYPES", "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<BeduinFileUploaderModel> S() {
            return b.f101226m;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return b.f101225l;
        }

        public a() {
        }
    }

    public b(@Y61.k BeduinFileUploaderModel beduinFileUploaderModel, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k lj.e eVar, @Y61.k n nVar) {
        this.f101227e = beduinFileUploaderModel;
        this.f101228f = interfaceC15523b;
        this.f101229g = eVar;
        this.f101230h = nVar;
        this.f101231i = beduinFileUploaderModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101227e;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinFileUploaderModel beduinFileUploaderModel = (BeduinFileUploaderModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        FileUploaderModelChanged[] fileUploaderModelChangedArrValues = FileUploaderModelChanged.values();
        if (fileUploaderModelChangedArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, FileUploaderModelChanged.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(fileUploaderModelChangedArrValues));
        BeduinFileUploaderModel beduinFileUploaderModel2 = this.f101227e;
        if (!L.f(fVar.invoke(beduinFileUploaderModel2), fVar.invoke(beduinFileUploaderModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FileUploaderModelChanged fileUploaderModelChanged : fileUploaderModelChangedArrValues) {
            if (!L.f(fileUploaderModelChanged.b().invoke(beduinFileUploaderModel2), fileUploaderModelChanged.b().invoke(beduinFileUploaderModel))) {
                arrayList.add(fileUploaderModelChanged);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        k kVar = new k(new ContextThemeWrapper(viewGroup.getContext(), this.f101227e.getButtonConfiguration().getTheme().f100608b), null, 0, 6, null);
        kVar.setLayoutParams(layoutParams);
        return kVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        k kVar = (k) view;
        u(kVar);
        BeduinFileUploaderModel beduinFileUploaderModel = this.f101227e;
        kVar.setStylesProvider(new u(beduinFileUploaderModel));
        kVar.setEnabled(beduinFileUploaderModel.getButtonConfiguration().isEnabled());
        kVar.setErrorMessage(beduinFileUploaderModel.getErrorMessage());
        ButtonConfiguration buttonConfiguration = beduinFileUploaderModel.getButtonConfiguration();
        Button button = kVar.f101293b;
        Drawable drawableC = com.avito.android.beduin.common.utils.v.c(button.getContext(), buttonConfiguration.getLocalIcon(), null);
        if (drawableC != null) {
            int i12 = k.a.f101299a[buttonConfiguration.getIconPosition().ordinal()];
            if (i12 == 1) {
                Button.g(button, drawableC, null, false, null, 14);
            } else if (i12 == 2) {
                Button.g(button, null, drawableC, false, null, 13);
            }
        }
        String title = buttonConfiguration.getTitle();
        if (title == null) {
            title = "";
        }
        button.setText(title);
        button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(buttonConfiguration.getStyle()));
        kVar.setOnUploadClickListener(new c(this));
        kVar.getListAdapter().l(beduinFileUploaderModel.getFiles(), null);
        kVar.setFilesVisibility(O2.a(beduinFileUploaderModel.getFiles()));
        kVar.setOnDeleteClickListener(new d(this));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        k kVar = (k) view;
        u(kVar);
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        e eVar2 = new e(kVar, this);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(eVar2, list);
    }

    public final void u(k kVar) {
        androidx.appcompat.app.m mVarC = C35835l0.c(kVar.getContext());
        if (mVarC == null) {
            return;
        }
        androidx.view.result.h<String[]> hVar = this.f101232j;
        if (hVar != null) {
            hVar.c();
        }
        this.f101232j = mVarC.getActivityResultRegistry().e("BeduinFileUploader_" + this.f101229g.getF103350r() + '_' + this.f101231i.getF100853b(), new b.g(), new androidx.view.result.a() { // from class: com.avito.android.beduin.common.component.file_uploader.a
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                List<FileItem> files;
                List list = (List) obj;
                b bVar = this.f101223b;
                String f103350r = bVar.f101229g.getF103350r();
                String f100853b = bVar.f101231i.getF100853b();
                n nVar = bVar.f101230h;
                nVar.getClass();
                n.a aVar = new n.a(f103350r, f100853b);
                BeduinFileUploaderModel beduinFileUploaderModelC = nVar.c(aVar);
                int i12 = 0;
                int size = (beduinFileUploaderModelC == null || (files = beduinFileUploaderModelC.getFiles()) == null) ? 0 : files.size();
                for (Object obj2 : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    com.avito.android.beduin.common.component.file_uploader.data.g gVar = nVar.f101304c;
                    gVar.getClass();
                    G g12 = new G(new CallableC13028a(8, gVar, (Uri) obj2));
                    InterfaceC35745a5 interfaceC35745a5 = nVar.f101303b;
                    nVar.f101306e.b(g12.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new q(nVar, aVar, size, i12), io.reactivex.rxjava3.internal.functions.a.f401996f));
                    i12 = i13;
                }
            }
        });
    }
}

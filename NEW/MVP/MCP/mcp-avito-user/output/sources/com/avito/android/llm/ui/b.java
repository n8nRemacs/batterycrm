package com.avito.android.llm.ui;

import Y61.k;
import Y61.l;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: LlmDescriptionPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/llm/ui/b;", "Lcom/avito/android/llm/ui/LlmDescriptionPresenter;", "<init>", "()V", "_avito_llm_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements LlmDescriptionPresenter {

    /* renamed from: d, reason: collision with root package name */
    @l
    public CharParameter.AutoDescription f181691d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public CharParameter.AutoBeautification f181692e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public d f181693f;

    /* renamed from: i, reason: collision with root package name */
    @l
    public H f181696i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public String f181697j;

    /* renamed from: a, reason: collision with root package name */
    @k
    public LlmDescriptionPresenter.Feature f181688a = LlmDescriptionPresenter.Feature.f181679d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public String f181689b = "";

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C42754k<String> f181690c = new C42754k<>();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinkedHashSet f181694g = new LinkedHashSet();

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinkedHashSet f181695h = new LinkedHashSet();

    /* compiled from: LlmDescriptionPresenterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LlmDescriptionPresenter.Feature.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LlmDescriptionPresenter.Feature feature = LlmDescriptionPresenter.Feature.f181677b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LlmDescriptionPresenter.Feature feature2 = LlmDescriptionPresenter.Feature.f181677b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    public final boolean a() {
        LlmDescriptionPresenter.Feature feature = LlmDescriptionPresenter.Feature.f181677b;
        return this.f181692e != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    public final void b(@k Y41.l<? super com.avito.android.llm.ui.a, G0> lVar) {
        this.f181696i = (H) lVar;
    }

    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    public final void c() {
        this.f181690c.clear();
        m();
    }

    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    @k
    /* renamed from: d, reason: from getter */
    public final LlmDescriptionPresenter.Feature getF181688a() {
        return this.f181688a;
    }

    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    public final void e(@k String str) {
        String str2 = this.f181689b;
        C42754k<String> c42754k = this.f181690c;
        c42754k.addFirst(str2);
        if (c42754k.f406741d > 5 && !c42754k.isEmpty()) {
            c42754k.removeLast();
        }
        this.f181694g.add(str);
        CharParameter.AutoDescription autoDescription = this.f181691d;
        if (autoDescription == null) {
            return;
        }
        autoDescription.setDidUserGenerateDescription(true);
    }

    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    public final void f(@k d dVar) {
        this.f181693f = dVar;
        String str = this.f181697j;
        if (str != null) {
            dVar.j3(str);
        }
        m();
    }

    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    public final void g(@k String str) {
        if (!str.equals(this.f181689b)) {
            this.f181697j = null;
        }
        this.f181689b = str;
        m();
    }

    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    @k
    /* renamed from: h, reason: from getter */
    public final String getF181689b() {
        return this.f181689b;
    }

    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    public final void i() {
        String strV = this.f181690c.v();
        if (strV == null) {
            return;
        }
        d dVar = this.f181693f;
        if (dVar != null) {
            dVar.y0(strV);
        }
        m();
    }

    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    public final void j(@l CharParameter.AutoDescription autoDescription, @l CharParameter.AutoBeautification autoBeautification) {
        this.f181691d = autoDescription;
        this.f181692e = autoBeautification;
        m();
    }

    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    public final void k(@k String str) {
        String str2 = this.f181689b;
        C42754k<String> c42754k = this.f181690c;
        c42754k.addFirst(str2);
        if (c42754k.f406741d > 5 && !c42754k.isEmpty()) {
            c42754k.removeLast();
        }
        this.f181694g.add(str);
    }

    @Override // com.avito.android.llm.ui.LlmDescriptionPresenter
    public final void l() {
        String needPreviousFieldsValidationError;
        CharParameter.AutoDescription autoDescription = this.f181691d;
        if (autoDescription == null || (needPreviousFieldsValidationError = autoDescription.getNeedPreviousFieldsValidationError()) == null) {
            return;
        }
        this.f181697j = needPreviousFieldsValidationError;
        d dVar = this.f181693f;
        if (dVar != null) {
            dVar.j3(needPreviousFieldsValidationError);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Type inference failed for: r0v26, types: [Y41.l, kotlin.jvm.internal.H] */
    /* JADX WARN: Type inference failed for: r1v14, types: [Y41.l, kotlin.jvm.internal.H] */
    /* JADX WARN: Type inference failed for: r1v5, types: [Y41.l, kotlin.jvm.internal.H] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.llm.ui.b.m():void");
    }
}

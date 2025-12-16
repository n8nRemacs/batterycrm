package com.avito.android.publish.start_publish;

import com.avito.android.remote.model.WizardParameter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AddAdvertInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/WizardParameter;", "it", "", "Lcom/avito/android/publish/start_publish/e;", "apply", "(Lcom/avito/android/remote/model/WizardParameter;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.start_publish.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34127b<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34129d f245346b;

    public C34127b(C34129d c34129d) {
        this.f245346b = c34129d;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List<WizardParameter> children = ((WizardParameter) obj).getChildren();
        ArrayList arrayList = new ArrayList(C42745f0.q(children, 10));
        for (WizardParameter wizardParameter : children) {
            this.f245346b.getClass();
            arrayList.add(new C34130e(wizardParameter.getNavigation(), wizardParameter.getTitle()));
        }
        return arrayList;
    }
}

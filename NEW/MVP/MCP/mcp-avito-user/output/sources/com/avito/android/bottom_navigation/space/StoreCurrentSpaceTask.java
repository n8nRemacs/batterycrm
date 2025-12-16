package com.avito.android.bottom_navigation.space;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.view.O0;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;

/* compiled from: StoreCurrentSpaceTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/bottom_navigation/space/StoreCurrentSpaceTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/bottom_navigation/space/a;", "bottomNavigationCurrentSpaceProvider", "Lcom/avito/android/bottom_navigation/space/f;", "inheritedSpaceCache", "<init>", "(Lcom/avito/android/bottom_navigation/space/a;Lcom/avito/android/bottom_navigation/space/f;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/bottom_navigation/space/a;", "Lcom/avito/android/bottom_navigation/space/f;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StoreCurrentSpaceTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final com.avito.android.bottom_navigation.space.a bottomNavigationCurrentSpaceProvider;

    @Y61.k
    private final f inheritedSpaceCache;

    /* compiled from: StoreCurrentSpaceTask.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bottom_navigation/space/StoreCurrentSpaceTask$a", "Lid/i;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends id.i {
        public a() {
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
            if (!(activity instanceof o) && (activity instanceof androidx.view.n)) {
                androidx.view.n nVar = (androidx.view.n) activity;
                InheritedSpaceHolderViewModel inheritedSpaceHolderViewModel = (InheritedSpaceHolderViewModel) new O0(m0.f406844a.b(InheritedSpaceHolderViewModel.class), new l(nVar), new k(nVar, j.f107081l), new m(nVar)).getValue();
                StoreCurrentSpaceTask storeCurrentSpaceTask = StoreCurrentSpaceTask.this;
                if (bundle == null) {
                    inheritedSpaceHolderViewModel.f107070E = storeCurrentSpaceTask.bottomNavigationCurrentSpaceProvider.n();
                }
                f fVar = storeCurrentSpaceTask.inheritedSpaceCache;
                fVar.f107078a.put(activity, inheritedSpaceHolderViewModel.f107070E);
            }
        }
    }

    @Inject
    public StoreCurrentSpaceTask(@Y61.k com.avito.android.bottom_navigation.space.a aVar, @Y61.k f fVar) {
        this.bottomNavigationCurrentSpaceProvider = aVar;
        this.inheritedSpaceCache = fVar;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        application.registerActivityLifecycleCallbacks(new a());
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}

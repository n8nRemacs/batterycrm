package com.avito.android.publish.start_publish;

import com.avito.android.publish.start_publish.StartPublishSheet;
import com.avito.android.publish.start_publish.StartPublishViewModel;
import com.avito.android.remote.model.publish.PublishInitialToast;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StartPublishViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/publish/start_publish/StartPublishSheet$SheetData$CategoryShortcutItem;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class J<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartPublishViewModel f245266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublishInitialToast f245267c;

    public J(StartPublishViewModel startPublishViewModel, PublishInitialToast publishInitialToast) {
        this.f245266b = startPublishViewModel;
        this.f245267c = publishInitialToast;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        StartPublishViewModel startPublishViewModel = this.f245266b;
        startPublishViewModel.le();
        startPublishViewModel.ne(new StartPublishViewModel.State.WizardSheet(new StartPublishSheet.SheetData((List) obj, this.f245267c)));
    }
}

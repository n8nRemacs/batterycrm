package com.avito.android.publish.start_publish;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.publish.start_publish.StartPublishViewModel;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: StartPublishViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class G<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartPublishViewModel f245261b;

    public G(StartPublishViewModel startPublishViewModel) {
        this.f245261b = startPublishViewModel;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        if (!(interfaceC14249c instanceof AdvertPublicationLink.a.C3985a)) {
            if (interfaceC14249c instanceof InterfaceC14249c.a) {
                return;
            }
            boolean z12 = interfaceC14249c instanceof InterfaceC14249c.b;
            return;
        }
        StartPublishViewModel startPublishViewModel = this.f245261b;
        StartPublishViewModel.ResumeStrategy resumeStrategy = (StartPublishViewModel.ResumeStrategy) startPublishViewModel.f245320M.b("key.finish_on_resume");
        if (resumeStrategy == null) {
            resumeStrategy = StartPublishViewModel.ResumeStrategy.f245327b;
        }
        if (resumeStrategy != StartPublishViewModel.ResumeStrategy.f245329d) {
            startPublishViewModel.f245320M.e(StartPublishViewModel.ResumeStrategy.f245327b, "key.finish_on_resume");
        }
    }
}

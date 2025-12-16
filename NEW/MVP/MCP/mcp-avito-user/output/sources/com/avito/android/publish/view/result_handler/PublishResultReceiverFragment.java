package com.avito.android.publish.view.result_handler;

import Y41.q;
import Y61.l;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PublishResultReceiverFragment.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/view/result_handler/PublishResultReceiverFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class PublishResultReceiverFragment extends BaseFragment {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.view.result_handler.a f245673n0;

    /* compiled from: PublishResultReceiverFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements q<Integer, Integer, Intent, G0> {
        @Override // Y41.q
        public final G0 invoke(Integer num, Integer num2, Intent intent) {
            ((PublishResultReceiverFragment) this.receiver).q5(num.intValue(), num2.intValue(), intent);
            return G0.f406611a;
        }
    }

    /* compiled from: PublishResultReceiverFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements q<Integer, Integer, Intent, G0> {
        @Override // Y41.q
        public final G0 invoke(Integer num, Integer num2, Intent intent) {
            ((PublishResultReceiverFragment) this.receiver).q5(num.intValue(), num2.intValue(), intent);
            return G0.f406611a;
        }
    }

    public PublishResultReceiverFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        com.avito.android.publish.view.result_handler.a aVar = this.f245673n0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.d(getTag(), i12, i13, intent, new a(3, this, PublishResultReceiverFragment.class, "onPublishIntentResult", "onPublishIntentResult(IILandroid/content/Intent;)V", 0));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.avito.android.publish.view.result_handler.a aVar = this.f245673n0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.b(getTag(), new b(3, this, PublishResultReceiverFragment.class, "onPublishIntentResult", "onPublishIntentResult(IILandroid/content/Intent;)V", 0));
    }

    public void q5(int i12, int i13, @l Intent intent) {
    }
}

package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "Lkotlin/G0;", "invoke", "(Landroid/content/res/Configuration;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<Configuration, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Configuration> f41151l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(InterfaceC22204y1<Configuration> interfaceC22204y1) {
        super(1);
        this.f41151l = interfaceC22204y1;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Configuration configuration) {
        Configuration configuration2 = new Configuration(configuration);
        C22143q0 c22143q0 = AndroidCompositionLocals_androidKt.f41068a;
        this.f41151l.setValue(configuration2);
        return kotlin.G0.f406611a;
    }
}

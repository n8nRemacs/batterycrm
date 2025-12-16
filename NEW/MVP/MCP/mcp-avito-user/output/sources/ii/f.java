package Ii;

import C11.b;
import com.avito.android.beduin.v2.page.impl.BeduinV2PageFragment;
import com.avito.android.beduin.v2.page.impl.compose.BeduinV2PageComposeFragment;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import kotlin.Metadata;

/* compiled from: BeduinV2PageFragmentComponent.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LIi/f;", "", "a", "b", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface f {

    /* compiled from: BeduinV2PageFragmentComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIi/f$a;", "", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        f a(@Y61.k C31138n0 c31138n0, @h31.b @Y61.k String str);
    }

    /* compiled from: BeduinV2PageFragmentComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIi/f$b;", "Lcom/avito/android/di/h;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h {
        @Y61.k
        a ka();
    }

    void a(@Y61.k BeduinV2PageFragment beduinV2PageFragment);

    void b(@Y61.k BeduinV2PageComposeFragment beduinV2PageComposeFragment);
}

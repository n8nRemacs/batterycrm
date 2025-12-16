package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.TimePickerState", f = "TimePicker.kt", i = {0, 0}, l = {733, 734}, m = "settle", n = {"this", "targetValue"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class Vk extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Sk f35702q;

    /* renamed from: r, reason: collision with root package name */
    public kotlin.Q f35703r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f35704s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Sk f35705t;

    /* renamed from: u, reason: collision with root package name */
    public int f35706u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vk(Sk sk2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35705t = sk2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f35704s = obj;
        this.f35706u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f35705t.c(this);
    }
}

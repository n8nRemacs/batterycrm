package Fc1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import feedback.shared.sdk.api.network.entities.Campaign;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

@DebugMetadata(c = "feedback.shared.sdk.api.validators.AttributesValidator", f = "AttributesValidator.kt", i = {0, 0, 0, 0}, l = {145}, m = "selectCandidate", n = {"this", "result", "campaign", "campaignEventName"}, s = {"L$0", "L$1", "L$3", "L$4"})
/* renamed from: Fc1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13578c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C13560a f5426q;

    /* renamed from: r, reason: collision with root package name */
    public l0.h f5427r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f5428s;

    /* renamed from: t, reason: collision with root package name */
    public Campaign f5429t;

    /* renamed from: u, reason: collision with root package name */
    public String f5430u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f5431v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C13560a f5432w;

    /* renamed from: x, reason: collision with root package name */
    public int f5433x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13578c(C13560a c13560a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5432w = c13560a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f5431v = obj;
        this.f5433x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f5432w.a(this);
    }
}

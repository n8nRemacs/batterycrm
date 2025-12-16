package d61;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.http.C41531l0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.l0;

/* renamed from: d61.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39519c extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f393670A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ f f393671B;

    /* renamed from: C, reason: collision with root package name */
    public int f393672C;

    /* renamed from: q, reason: collision with root package name */
    public Object f393673q;

    /* renamed from: r, reason: collision with root package name */
    public Object f393674r;

    /* renamed from: s, reason: collision with root package name */
    public C41531l0 f393675s;

    /* renamed from: t, reason: collision with root package name */
    public String f393676t;

    /* renamed from: u, reason: collision with root package name */
    public l0.f f393677u;

    /* renamed from: v, reason: collision with root package name */
    public l0.h f393678v;

    /* renamed from: w, reason: collision with root package name */
    public Object f393679w;

    /* renamed from: x, reason: collision with root package name */
    public Object f393680x;

    /* renamed from: y, reason: collision with root package name */
    public Object f393681y;

    /* renamed from: z, reason: collision with root package name */
    public int f393682z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39519c(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f393671B = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f393670A = obj;
        this.f393672C |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f393671B.a(null, this);
    }
}

package fa1;

import android.content.Context;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: fa1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40387a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C40388b f395956q;

    /* renamed from: r, reason: collision with root package name */
    public Context f395957r;

    /* renamed from: s, reason: collision with root package name */
    public Collection f395958s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f395959t;

    /* renamed from: u, reason: collision with root package name */
    public Collection f395960u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f395961v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C40388b f395962w;

    /* renamed from: x, reason: collision with root package name */
    public int f395963x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40387a(C40388b c40388b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f395962w = c40388b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f395961v = obj;
        this.f395963x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f395962w.a(null, null, this);
    }
}

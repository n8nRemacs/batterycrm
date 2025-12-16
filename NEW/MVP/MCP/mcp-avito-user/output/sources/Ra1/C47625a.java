package ra1;

import android.graphics.Bitmap;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: ra1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47625a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Bitmap f429877q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f429878r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C47626b f429879s;

    /* renamed from: t, reason: collision with root package name */
    public int f429880t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47625a(C47626b c47626b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f429879s = c47626b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f429878r = obj;
        this.f429880t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f429879s.a(null, null, this);
    }
}

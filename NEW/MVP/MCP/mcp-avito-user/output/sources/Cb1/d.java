package Cb1;

import Db1.a;
import Fc1.W4;
import Fc1.X6;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.P;
import androidx.core.graphics.z;
import com.adjust.sdk.Constants;
import j.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.u0;

@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LCb1/d;", "", "<init>", "()V", "a", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f2296a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2297b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f2298c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public transient Typeface f2299d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"LCb1/d$a;", "", "<init>", "()V", "", "BLACK", "I", "BOLD", "EXTRA_BOLD", "EXTRA_LIGHT", "LIGHT", "MEDIUM", "NORMAL", "SEMI_BOLD", "THIN", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        new a(null);
    }

    public d() {
        u0 u0Var = u0.f406856a;
        this.f2296a = Constants.MINIMAL_ERROR_STATUS_CODE;
        c.f2294b.getClass();
        c cVar = new c(null);
        cVar.f2295a = 14;
        this.f2298c = cVar;
    }

    public final void a(Typeface typeface) {
        Typeface typefaceA = null;
        if (typeface != null) {
            X6 x62 = W4.a.f5280a;
            typefaceA = z.a((x62 != null ? x62 : null).f5319a, typeface, this.f2296a, this.f2297b);
        }
        this.f2299d = typefaceA;
    }

    public d(@k TypedArray typedArray, @g0 int i12, int i13, int i14) throws Resources.NotFoundException {
        Typeface typefaceC;
        this();
        if (this.f2296a != i13) {
            this.f2296a = i13;
            a(this.f2299d);
        }
        c.f2294b.getClass();
        X6 x62 = null;
        c cVar = new c(null);
        cVar.f2295a = i14;
        this.f2298c = cVar;
        if (typedArray.hasValue(i12)) {
            try {
                int i15 = J.f406821a;
                int resourceId = typedArray.getResourceId(i12, 0);
                X6 x63 = W4.a.f5280a;
                TypedArray typedArrayObtainStyledAttributes = (x63 == null ? null : x63).f5319a.obtainStyledAttributes(resourceId, a.o.f3259b);
                try {
                    this.f2298c = new c(typedArrayObtainStyledAttributes, 1, (int) (i14 * Resources.getSystem().getDisplayMetrics().density));
                    int i16 = typedArrayObtainStyledAttributes.getInt(2, i13);
                    if (this.f2296a != i16) {
                        this.f2296a = i16;
                        a(this.f2299d);
                    }
                    boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, false);
                    if (this.f2297b != z12) {
                        this.f2297b = z12;
                        a(this.f2299d);
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    X6 x64 = W4.a.f5280a;
                    typedArrayObtainStyledAttributes = (x64 == null ? null : x64).f5319a.obtainStyledAttributes(resourceId, a.o.f3258a);
                    try {
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(16, 0);
                        if (resourceId2 == 0) {
                            String string = typedArrayObtainStyledAttributes.getString(16);
                            if (string == null) {
                                u0 u0Var = u0.f406856a;
                            }
                            typefaceC = Typeface.create(string, 0);
                        } else {
                            X6 x65 = W4.a.f5280a;
                            (x65 == null ? null : x65).f5319a.getResources().getResourceName(resourceId2);
                            X6 x66 = W4.a.f5280a;
                            if (x66 != null) {
                                x62 = x66;
                            }
                            typefaceC = androidx.core.content.res.i.c(resourceId2, x62.f5319a);
                        }
                        a(typefaceC);
                        typedArrayObtainStyledAttributes.recycle();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } finally {
                    typedArrayObtainStyledAttributes.recycle();
                }
            } catch (Exception unused) {
            }
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }
}

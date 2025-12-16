package ma1;

import androidx.fragment.app.ActivityC22955m;
import java.nio.FloatBuffer;
import org.tensorflow.lite.InterpreterApi;
import wa1.q;
import ya1.C50207c;

/* renamed from: ma1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44038a {

    /* renamed from: a, reason: collision with root package name */
    public final C50207c f414589a;

    /* renamed from: b, reason: collision with root package name */
    public final InterpreterApi f414590b;

    /* renamed from: c, reason: collision with root package name */
    public final FloatBuffer f414591c = FloatBuffer.allocate(145200);

    /* renamed from: d, reason: collision with root package name */
    public final FloatBuffer f414592d = FloatBuffer.allocate(2352);

    public C44038a(ActivityC22955m activityC22955m) {
        this.f414589a = new C50207c(activityC22955m);
        this.f414590b = q.a(activityC22955m, "registration_detector.tflite");
    }
}

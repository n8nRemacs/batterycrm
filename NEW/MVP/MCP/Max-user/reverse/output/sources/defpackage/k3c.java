package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class k3c implements c4h {
    public static final crf a = ml6.k(new te4(4));

    @Override // defpackage.c4h
    public final e4h a(Context context, uy0 uy0Var, gf3 gf3Var, boolean z, v32 v32Var) throws IllegalAccessException, VideoFrameProcessingException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Class cls = (Class) a.get();
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            cls.getMethod("setEnableReplayableCache", Boolean.TYPE).invoke(objNewInstance, Boolean.FALSE);
            Object objInvoke = cls.getMethod("build", null).invoke(objNewInstance, null);
            objInvoke.getClass();
            return ((c4h) objInvoke).a(context, uy0Var, gf3Var, z, v32Var);
        } catch (Exception e) {
            throw new VideoFrameProcessingException(e);
        }
    }
}

package defpackage;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class c6a implements uf7 {
    public final int a;

    public c6a(int i) {
        this.a = i;
    }

    @Override // defpackage.uf7
    public final tf7 createImageTranscoder(me7 me7Var, boolean z) {
        int i = this.a;
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            tf7 tf7VarCreateImageTranscoder = ((uf7) NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(Integer.valueOf(i), Boolean.FALSE, Boolean.TRUE)).createImageTranscoder(me7Var, z);
            return tf7VarCreateImageTranscoder == null ? new ym3(z, this.a) : tf7VarCreateImageTranscoder;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
        } catch (IllegalArgumentException e3) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e5);
        } catch (SecurityException e6) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e7);
        }
    }
}

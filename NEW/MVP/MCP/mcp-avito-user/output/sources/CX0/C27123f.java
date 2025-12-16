package cX0;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import com.facebook.infer.annotation.Nullsafe;
import java.lang.reflect.InvocationTargetException;

/* compiled from: MultiImageTranscoderFactory.java */
@Nullsafe
/* renamed from: cX0.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C27123f implements InterfaceC27121d {

    /* renamed from: a, reason: collision with root package name */
    @I41.h
    public final InterfaceC27121d f57920a;

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public final Integer f57921b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f57922c;

    public C27123f(@I41.h InterfaceC27121d interfaceC27121d, @I41.h Integer num, boolean z12) {
        this.f57920a = interfaceC27121d;
        this.f57921b = num;
        this.f57922c = z12;
    }

    @I41.h
    public final InterfaceC27120c a(RW0.c cVar, boolean z12) {
        boolean z13 = this.f57922c;
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            return ((InterfaceC27121d) NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(2048, Boolean.FALSE, Boolean.valueOf(z13))).createImageTranscoder(cVar, z12);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e12) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e12);
        }
    }

    @Override // cX0.InterfaceC27121d
    public final InterfaceC27120c createImageTranscoder(RW0.c cVar, boolean z12) {
        InterfaceC27120c interfaceC27120cA = null;
        InterfaceC27121d interfaceC27121d = this.f57920a;
        InterfaceC27120c interfaceC27120cCreateImageTranscoder = interfaceC27121d == null ? null : interfaceC27121d.createImageTranscoder(cVar, z12);
        if (interfaceC27120cCreateImageTranscoder == null) {
            Integer num = this.f57921b;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    interfaceC27120cA = a(cVar, z12);
                } else {
                    if (iIntValue != 1) {
                        throw new IllegalArgumentException("Invalid ImageTranscoderType");
                    }
                    interfaceC27120cA = new C27124g(z12);
                }
            }
            interfaceC27120cCreateImageTranscoder = interfaceC27120cA;
        }
        if (interfaceC27120cCreateImageTranscoder == null) {
            interfaceC27120cCreateImageTranscoder = a(cVar, z12);
        }
        return interfaceC27120cCreateImageTranscoder == null ? new C27124g(z12) : interfaceC27120cCreateImageTranscoder;
    }
}

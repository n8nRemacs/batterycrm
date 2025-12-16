package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d implements com.google.firebase.encoders.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f361570a;

    @Override // com.google.firebase.encoders.d
    public final void encode(Object obj, Object obj2) {
        switch (this.f361570a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
                Charset charset = e.f361571f;
                eVar.add(e.f361572g, entry.getKey());
                eVar.add(e.f361573h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}

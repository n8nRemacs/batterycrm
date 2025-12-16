package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zzvh;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public class zzvh<MessageType extends zzvn<MessageType, BuilderType>, BuilderType extends zzvh<MessageType, BuilderType>> extends zztt<MessageType, BuilderType> {

    /* renamed from: b, reason: collision with root package name */
    public final zzvn f354058b;

    /* renamed from: c, reason: collision with root package name */
    public zzvn f354059c;

    public zzvh(MessageType messagetype) {
        this.f354058b = messagetype;
        if (messagetype.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f354059c = (zzvn) messagetype.h(4, null);
    }

    public final void a() {
        if (this.f354059c.g()) {
            return;
        }
        e();
    }

    public void e() {
        zzvn zzvnVar = (zzvn) this.f354058b.h(4, null);
        zzxb.zza().zzb(zzvnVar.getClass()).zzg(zzvnVar, this.f354059c);
        this.f354059c = zzvnVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztt
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final zzvh clone() {
        zzvh zzvhVar = (zzvh) this.f354058b.h(5, null);
        zzvhVar.f354059c = zzp();
        return zzvhVar;
    }

    public final MessageType zzn() {
        MessageType messagetype = (MessageType) zzp();
        if (messagetype.zzt()) {
            return messagetype;
        }
        throw new zzxv(messagetype);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwr
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public MessageType zzp() {
        if (!this.f354059c.g()) {
            return (MessageType) this.f354059c;
        }
        zzvn zzvnVar = this.f354059c;
        zzvnVar.getClass();
        zzxb.zza().zzb(zzvnVar.getClass()).zzf(zzvnVar);
        zzvnVar.c();
        return (MessageType) this.f354059c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwt
    public final /* bridge */ /* synthetic */ zzws zzq() {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwt
    public final boolean zzt() {
        return zzvn.f(this.f354059c, false);
    }
}

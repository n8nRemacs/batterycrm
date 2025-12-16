package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public class zzdw<MessageType extends zzec<MessageType, BuilderType>, BuilderType extends zzdw<MessageType, BuilderType>> extends zzcj<MessageType, BuilderType> {

    /* renamed from: b, reason: collision with root package name */
    public final zzec f352435b;

    /* renamed from: c, reason: collision with root package name */
    public zzec f352436c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f352437d = false;

    public zzdw(MessageType messagetype) {
        this.f352435b = messagetype;
        this.f352436c = (zzec) messagetype.m(4, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcj
    public final /* synthetic */ zzdw a(zzck zzckVar) {
        zzi((zzec) zzckVar);
        return this;
    }

    public void e() {
        zzec zzecVar = (zzec) this.f352436c.m(4, null);
        zzfu.zza().zzb(zzecVar.getClass()).zzg(zzecVar, this.f352436c);
        this.f352436c = zzecVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final /* synthetic */ zzfl zzX() {
        return this.f352435b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final boolean zzY() {
        return zzec.l(this.f352436c, false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcj
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdw zze() {
        zzdw zzdwVar = (zzdw) this.f352435b.m(5, null);
        zzdwVar.zzi(zzm());
        return zzdwVar;
    }

    public final zzdw zzi(zzec zzecVar) {
        if (this.f352437d) {
            e();
            this.f352437d = false;
        }
        zzec zzecVar2 = this.f352436c;
        zzfu.zza().zzb(zzecVar2.getClass()).zzg(zzecVar2, zzecVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final MessageType zzl() {
        MessageType messagetype = (MessageType) zzm();
        if (messagetype.zzY()) {
            return messagetype;
        }
        throw new zzgo(messagetype);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public MessageType zzm() {
        if (this.f352437d) {
            return (MessageType) this.f352436c;
        }
        zzec zzecVar = this.f352436c;
        zzfu.zza().zzb(zzecVar.getClass()).zzf(zzecVar);
        this.f352437d = true;
        return (MessageType) this.f352436c;
    }
}

package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public class zzet<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdp<MessageType, BuilderType> {

    /* renamed from: b, reason: collision with root package name */
    public final zzhs f350102b;

    /* renamed from: c, reason: collision with root package name */
    public zzev f350103c;

    public zzet(zzhs zzhsVar) {
        this.f350102b = zzhsVar;
        if (zzhsVar.f()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f350103c = (zzev) zzhsVar.g(4);
    }

    @Override // com.google.android.gms.internal.auth.zzdp
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzet clone() {
        zzet zzetVar = (zzet) this.f350102b.g(5);
        zzetVar.f350103c = zzd();
        return zzetVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfw
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public MessageType zzd() {
        if (!this.f350103c.f()) {
            return (MessageType) this.f350103c;
        }
        zzev zzevVar = this.f350103c;
        zzevVar.getClass();
        zzgf.zza().zzb(zzevVar.getClass()).zze(zzevVar);
        zzevVar.c();
        return (MessageType) this.f350103c;
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* bridge */ /* synthetic */ zzfx zze() {
        throw null;
    }
}

package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.PlaybackStateCompat;
import com.adjust.sdk.Constants;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzni implements zznj {

    /* renamed from: A, reason: collision with root package name */
    public static final zzgv<String> f351013A;

    /* renamed from: B, reason: collision with root package name */
    public static final zzgv<Long> f351014B;

    /* renamed from: C, reason: collision with root package name */
    public static final zzgv<Long> f351015C;

    /* renamed from: D, reason: collision with root package name */
    public static final zzgv<Long> f351016D;

    /* renamed from: E, reason: collision with root package name */
    public static final zzgv<Long> f351017E;

    /* renamed from: F, reason: collision with root package name */
    public static final zzgv<Long> f351018F;

    /* renamed from: G, reason: collision with root package name */
    public static final zzgv<Long> f351019G;

    /* renamed from: H, reason: collision with root package name */
    public static final zzgv<Long> f351020H;

    /* renamed from: I, reason: collision with root package name */
    public static final zzgv<Long> f351021I;

    /* renamed from: J, reason: collision with root package name */
    public static final zzgv<Long> f351022J;

    /* renamed from: K, reason: collision with root package name */
    public static final zzgv<Long> f351023K;

    /* renamed from: L, reason: collision with root package name */
    public static final zzgv<Long> f351024L;

    /* renamed from: M, reason: collision with root package name */
    public static final zzgv<Long> f351025M;

    /* renamed from: N, reason: collision with root package name */
    public static final zzgv<Long> f351026N;

    /* renamed from: O, reason: collision with root package name */
    public static final zzgv<Long> f351027O;

    /* renamed from: P, reason: collision with root package name */
    public static final zzgv<Long> f351028P;

    /* renamed from: Q, reason: collision with root package name */
    public static final zzgv<Long> f351029Q;

    /* renamed from: R, reason: collision with root package name */
    public static final zzgv<Long> f351030R;

    /* renamed from: S, reason: collision with root package name */
    public static final zzgv<String> f351031S;

    /* renamed from: T, reason: collision with root package name */
    public static final zzgv<Long> f351032T;

    /* renamed from: U, reason: collision with root package name */
    public static final zzgv<String> f351033U;

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Long> f351034a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Long> f351035b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzgv<Long> f351036c;

    /* renamed from: d, reason: collision with root package name */
    public static final zzgv<Long> f351037d;

    /* renamed from: e, reason: collision with root package name */
    public static final zzgv<String> f351038e;

    /* renamed from: f, reason: collision with root package name */
    public static final zzgv<String> f351039f;

    /* renamed from: g, reason: collision with root package name */
    public static final zzgv<Long> f351040g;

    /* renamed from: h, reason: collision with root package name */
    public static final zzgv<String> f351041h;

    /* renamed from: i, reason: collision with root package name */
    public static final zzgv<Long> f351042i;

    /* renamed from: j, reason: collision with root package name */
    public static final zzgv<Long> f351043j;

    /* renamed from: k, reason: collision with root package name */
    public static final zzgv<Long> f351044k;

    /* renamed from: l, reason: collision with root package name */
    public static final zzgv<Long> f351045l;

    /* renamed from: m, reason: collision with root package name */
    public static final zzgv<Long> f351046m;

    /* renamed from: n, reason: collision with root package name */
    public static final zzgv<Long> f351047n;

    /* renamed from: o, reason: collision with root package name */
    public static final zzgv<Long> f351048o;

    /* renamed from: p, reason: collision with root package name */
    public static final zzgv<Long> f351049p;

    /* renamed from: q, reason: collision with root package name */
    public static final zzgv<Long> f351050q;

    /* renamed from: r, reason: collision with root package name */
    public static final zzgv<Long> f351051r;

    /* renamed from: s, reason: collision with root package name */
    public static final zzgv<String> f351052s;

    /* renamed from: t, reason: collision with root package name */
    public static final zzgv<Long> f351053t;

    /* renamed from: u, reason: collision with root package name */
    public static final zzgv<Long> f351054u;

    /* renamed from: v, reason: collision with root package name */
    public static final zzgv<Long> f351055v;

    /* renamed from: w, reason: collision with root package name */
    public static final zzgv<Long> f351056w;

    /* renamed from: x, reason: collision with root package name */
    public static final zzgv<String> f351057x;

    /* renamed from: y, reason: collision with root package name */
    public static final zzgv<String> f351058y;

    /* renamed from: z, reason: collision with root package name */
    public static final zzgv<String> f351059z;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351034a = zzhdVarZza.zza("measurement.ad_id_cache_time", 10000L);
        f351035b = zzhdVarZza.zza("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        f351036c = zzhdVarZza.zza("measurement.max_bundles_per_iteration", 100L);
        f351037d = zzhdVarZza.zza("measurement.config.cache_time", 86400000L);
        zzhdVarZza.zza("measurement.log_tag", "FA");
        f351038e = zzhdVarZza.zza("measurement.config.url_authority", "app-measurement.com");
        f351039f = zzhdVarZza.zza("measurement.config.url_scheme", Constants.SCHEME);
        f351040g = zzhdVarZza.zza("measurement.upload.debug_upload_interval", 1000L);
        f351041h = zzhdVarZza.zza("measurement.rb.attribution.event_params", "value|currency");
        zzhdVarZza.zza("measurement.id.rb.attribution.app_allowlist", 0L);
        f351042i = zzhdVarZza.zza("measurement.lifetimevalue.max_currency_tracked", 4L);
        f351043j = zzhdVarZza.zza("measurement.upload.max_event_parameter_value_length", 100L);
        f351044k = zzhdVarZza.zza("measurement.store.max_stored_events_per_app", 100000L);
        f351045l = zzhdVarZza.zza("measurement.experiment.max_ids", 50L);
        f351046m = zzhdVarZza.zza("measurement.audience.filter_result_max_count", 200L);
        f351047n = zzhdVarZza.zza("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f351048o = zzhdVarZza.zza("measurement.rb.attribution.client.min_ad_services_version", 7L);
        f351049p = zzhdVarZza.zza("measurement.alarm_manager.minimum_interval", 60000L);
        f351050q = zzhdVarZza.zza("measurement.upload.minimum_delay", 500L);
        f351051r = zzhdVarZza.zza("measurement.monitoring.sample_period_millis", 86400000L);
        f351052s = zzhdVarZza.zza("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots");
        f351053t = zzhdVarZza.zza("measurement.upload.realtime_upload_interval", 10000L);
        f351054u = zzhdVarZza.zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        zzhdVarZza.zza("measurement.config.cache_time.service", 3600000L);
        f351055v = zzhdVarZza.zza("measurement.service_client.idle_disconnect_millis", 5000L);
        zzhdVarZza.zza("measurement.log_tag.service", "FA-SVC");
        f351056w = zzhdVarZza.zza("measurement.upload.stale_data_deletion_interval", 86400000L);
        f351057x = zzhdVarZza.zza("measurement.rb.attribution.uri_authority", "google-analytics.com");
        f351058y = zzhdVarZza.zza("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        f351059z = zzhdVarZza.zza("measurement.rb.attribution.query_parameters_to_remove", "");
        f351013A = zzhdVarZza.zza("measurement.rb.attribution.uri_scheme", Constants.SCHEME);
        f351014B = zzhdVarZza.zza("measurement.sdk.attribution.cache.ttl", 604800000L);
        f351015C = zzhdVarZza.zza("measurement.redaction.app_instance_id.ttl", 7200000L);
        f351016D = zzhdVarZza.zza("measurement.upload.backoff_period", 43200000L);
        f351017E = zzhdVarZza.zza("measurement.upload.initial_upload_delay_time", 15000L);
        f351018F = zzhdVarZza.zza("measurement.upload.interval", 3600000L);
        f351019G = zzhdVarZza.zza("measurement.upload.max_bundle_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        f351020H = zzhdVarZza.zza("measurement.upload.max_bundles", 100L);
        f351021I = zzhdVarZza.zza("measurement.upload.max_conversions_per_day", 500L);
        f351022J = zzhdVarZza.zza("measurement.upload.max_error_events_per_day", 1000L);
        f351023K = zzhdVarZza.zza("measurement.upload.max_events_per_bundle", 1000L);
        f351024L = zzhdVarZza.zza("measurement.upload.max_events_per_day", 100000L);
        f351025M = zzhdVarZza.zza("measurement.upload.max_public_events_per_day", 50000L);
        f351026N = zzhdVarZza.zza("measurement.upload.max_queue_time", 2419200000L);
        f351027O = zzhdVarZza.zza("measurement.upload.max_realtime_events_per_day", 10L);
        f351028P = zzhdVarZza.zza("measurement.upload.max_batch_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        f351029Q = zzhdVarZza.zza("measurement.upload.retry_count", 6L);
        f351030R = zzhdVarZza.zza("measurement.upload.retry_time", 1800000L);
        f351031S = zzhdVarZza.zza("measurement.upload.url", "https://app-measurement.com/a");
        f351032T = zzhdVarZza.zza("measurement.upload.window_interval", 3600000L);
        f351033U = zzhdVarZza.zza("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zza() {
        return f351034a.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzaa() {
        return f351021I.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzab() {
        return f351022J.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzac() {
        return f351023K.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzad() {
        return f351024L.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzae() {
        return f351025M.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzaf() {
        return f351026N.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzag() {
        return f351027O.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzah() {
        return f351028P.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzai() {
        return f351029Q.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzaj() {
        return f351030R.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzak() {
        return f351032T.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzal() {
        return f351038e.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzam() {
        return f351039f.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzan() {
        return f351041h.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzao() {
        return f351052s.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzap() {
        return f351057x.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzaq() {
        return f351058y.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzar() {
        return f351059z.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzas() {
        return f351013A.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzat() {
        return f351031S.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final String zzau() {
        return f351033U.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzb() {
        return f351035b.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzc() {
        return f351036c.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzd() {
        return f351037d.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zze() {
        return f351040g.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzf() {
        return f351042i.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzg() {
        return f351043j.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzh() {
        return f351044k.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzi() {
        return f351045l.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzj() {
        return f351046m.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzk() {
        return f351047n.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzl() {
        return f351048o.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzm() {
        return f351049p.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzn() {
        return f351050q.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzo() {
        return f351051r.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzp() {
        return f351053t.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzq() {
        return f351054u.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzr() {
        return f351055v.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzs() {
        return f351056w.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzt() {
        return f351014B.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzu() {
        return f351015C.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzv() {
        return f351016D.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzw() {
        return f351017E.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzx() {
        return f351018F.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzy() {
        return f351019G.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zzz() {
        return f351020H.zza().longValue();
    }
}

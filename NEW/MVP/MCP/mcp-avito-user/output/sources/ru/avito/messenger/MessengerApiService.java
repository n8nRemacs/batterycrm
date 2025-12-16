package ru.avito.messenger;

import com.avito.android.jsonrpc.annotations.JsonRpcBody;
import com.avito.android.jsonrpc.annotations.JsonRpcMethod;
import com.avito.android.jsonrpc.annotations.JsonRpcMethodCall;
import com.avito.android.jsonrpc.annotations.JsonRpcMethodName;
import com.avito.android.jsonrpc.annotations.JsonRpcParam;
import com.avito.android.jsonrpc.annotations.JsonRpcParamsMap;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.context_actions.RecommendationsResponse;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.remote.model.messenger.geo.GeoSearchSuggests;
import com.avito.android.remote.model.messenger.get_settings.GetSettingsResponse;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggestsResponse;
import com.avito.android.remote.model.messenger.quick_replies.QuickRepliesResponse;
import com.avito.android.remote.model.messenger.video.VideosResponse;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.AddQuickReplyResponse;
import ru.avito.messenger.api.entity.BlacklistReasons;
import ru.avito.messenger.api.entity.BlacklistUserRequest;
import ru.avito.messenger.api.entity.BlockedUsersResponse;
import ru.avito.messenger.api.entity.BodyImagesResponse;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelsCounters;
import ru.avito.messenger.api.entity.ChannelsResponse;
import ru.avito.messenger.api.entity.ChannelsSearchResponse;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.ChatMessagesResponse;
import ru.avito.messenger.api.entity.CreateChunkedVideoFileResponse;
import ru.avito.messenger.api.entity.CreateFileResponse;
import ru.avito.messenger.api.entity.CreateVideoFileResponse;
import ru.avito.messenger.api.entity.CreateVoiceFileResponse;
import ru.avito.messenger.api.entity.FoldersCountersResponse;
import ru.avito.messenger.api.entity.GetFileResponse;
import ru.avito.messenger.api.entity.GetLastActionTimesResponse;
import ru.avito.messenger.api.entity.GetUsersResponse;
import ru.avito.messenger.api.entity.MultipartUploadPart;
import ru.avito.messenger.api.entity.PinUnpinChannelResponse;
import ru.avito.messenger.api.entity.SuccessResponse;
import ru.avito.messenger.api.entity.body.item.BodyItem;
import yk0.C50261a;

/* compiled from: MessengerApiService.kt */
@Metadata(d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002Û\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\bJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\bJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00140\u00062\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b\u0016\u0010\u0012Jw\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00022\u0010\b\u0001\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\b\"\u0010#JA\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b$\u0010%JY\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010&\u001a\u00020\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b'\u0010(JM\u0010*\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010)\u001a\u00020\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b*\u0010+J)\u0010-\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010,\u001a\u00020\u0002H'¢\u0006\u0004\b-\u0010.JM\u00100\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010/\u001a\u00020\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b0\u0010+Jm\u00106\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u00102\u001a\u0002012\b\b\u0001\u00103\u001a\u0002012\b\b\u0001\u00104\u001a\u00020\u00022\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b9\u0010:J+\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b=\u0010.J)\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010>\u001a\u00020\u001fH'¢\u0006\u0004\b@\u0010AJ?\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010B\u001a\u00020\u00022\b\b\u0001\u0010C\u001a\u00020\u00022\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bE\u0010%JC\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00062\b\b\u0001\u0010F\u001a\u00020\u00022\b\b\u0001\u0010G\u001a\u00020\u00022\b\b\u0001\u0010H\u001a\u00020\u00022\u000e\b\u0001\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u000eH'¢\u0006\u0004\bL\u0010MJ3\u0010N\u001a\b\u0012\u0004\u0012\u00020K0\u00062\b\b\u0001\u0010F\u001a\u00020\u00022\b\b\u0001\u0010G\u001a\u00020\u00022\b\b\u0001\u0010H\u001a\u00020\u0002H'¢\u0006\u0004\bN\u0010OJW\u0010Q\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010G\u001a\u00020\u00022\b\b\u0001\u0010P\u001a\u00020\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\bQ\u0010RJM\u0010S\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010G\u001a\u00020\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\bS\u0010+JW\u0010T\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010G\u001a\u00020\u00022\b\b\u0001\u0010F\u001a\u00020\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\bT\u0010RJ\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u00062\b\b\u0001\u0010G\u001a\u00020\u0002H'¢\u0006\u0004\bV\u0010:J1\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020U0\u00140\u00062\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bW\u0010\u0012JC\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00062\n\b\u0001\u0010X\u001a\u0004\u0018\u00010\u001f2\b\b\u0001\u0010Y\u001a\u00020\u001c2\u0016\b\u0003\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H'¢\u0006\u0004\b\\\u0010]J/\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\u000e\b\u0001\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b`\u0010aJ5\u0010e\u001a\b\u0012\u0004\u0012\u00020d0\u00062\b\b\u0001\u0010b\u001a\u00020\u001c2\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010\u001c2\b\b\u0001\u0010c\u001a\u00020\u0002H'¢\u0006\u0004\be\u0010fJ+\u0010h\u001a\b\u0012\u0004\u0012\u00020g0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\n\b\u0003\u0010Y\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\bh\u0010iJC\u0010l\u001a\b\u0012\u0004\u0012\u00020g0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u001f2\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010Y\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\bl\u0010mJ5\u0010n\u001a\b\u0012\u0004\u0012\u00020g0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010k\u001a\u00020\u001f2\n\b\u0003\u0010Y\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\bn\u0010oJ)\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010p\u001a\u00020\u001fH'¢\u0006\u0004\br\u0010AJ%\u0010t\u001a\b\u0012\u0004\u0012\u00020q0\u00062\u000e\b\u0001\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bt\u0010\u0012J%\u0010u\u001a\b\u0012\u0004\u0012\u00020q0\u00062\u000e\b\u0001\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bu\u0010\u0012J;\u0010v\u001a\b\u0012\u0004\u0012\u00020K0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\u000e\b\u0001\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\bv\u0010wJ%\u0010x\u001a\b\u0012\u0004\u0012\u00020q0\u00062\u000e\b\u0001\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bx\u0010\u0012J\u001f\u0010z\u001a\b\u0012\u0004\u0012\u00020y0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\bz\u0010:J+\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020|0\u000e0\u00062\u000e\b\u0001\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b}\u0010\u0012J)\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00062\u000e\b\u0001\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00020~H'¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001JD\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020K0\u00062\u0010\b\u0001\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010\u000e2\u000b\b\u0003\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001f2\u000b\b\u0003\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J#\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u00062\t\b\u0001\u0010\u0089\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b\u008b\u0001\u0010:J\u0019\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\u0006H'¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J,\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020K0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\t\b\u0001\u0010\u008f\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b\u0090\u0001\u0010.J,\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020K0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\t\b\u0001\u0010\u008f\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b\u0091\u0001\u0010.J(\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010\u00062\u000e\b\u0001\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0005\b\u0093\u0001\u0010\u0012J/\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010\u00062\b\b\u0001\u0010b\u001a\u00020\u001c2\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0018\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020K0\u0006H'¢\u0006\u0006\b\u0097\u0001\u0010\u008e\u0001J9\u0010\u0098\u0001\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\u00140\u00062\u000e\b\u0001\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0005\b\u0098\u0001\u0010\u0012J1\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020K0\u00062\u0017\b\u0001\u0010\u0099\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H'¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0019\u0010\u009d\u0001\u001a\t\u0012\u0005\u0012\u00030\u009c\u00010\u0006H'¢\u0006\u0006\b\u009d\u0001\u0010\u008e\u0001JC\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030 \u00010\u00062\u001b\b\u0001\u0010\u009e\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020~0\u00142\u000b\b\u0001\u0010\u009f\u0001\u001a\u0004\u0018\u00010qH'¢\u0006\u0006\b¡\u0001\u0010¢\u0001JW\u0010¤\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020|0\u000e0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u001f2\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\u001c2\t\b\u0001\u0010£\u0001\u001a\u00020\u0002H'¢\u0006\u0006\b¤\u0001\u0010¥\u0001J7\u0010§\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010\u00062\b\b\u0001\u00102\u001a\u0002012\b\b\u0001\u00103\u001a\u0002012\b\b\u0003\u00105\u001a\u00020\u0002H'¢\u0006\u0006\b§\u0001\u0010¨\u0001J;\u0010¬\u0001\u001a\t\u0012\u0005\u0012\u00030«\u00010\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010c\u001a\u00020\u00022\f\b\u0001\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001H'¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J=\u0010¯\u0001\u001a\t\u0012\u0005\u0012\u00030«\u00010\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\f\b\u0001\u0010®\u0001\u001a\u0005\u0018\u00010©\u00012\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0006\b¯\u0001\u0010°\u0001J,\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020!0\u00062\t\b\u0001\u0010±\u0001\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0005\b²\u0001\u0010.JJ\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020K0\u00062\u000e\b\u0001\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00020~2\u000f\b\u0001\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020~2\u000f\b\u0001\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020~H'¢\u0006\u0006\bµ\u0001\u0010¶\u0001JG\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020y0\u00062\b\b\u0001\u0010&\u001a\u00020\u00022\u000b\b\u0003\u0010·\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0003\u0010¸\u0001\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0005\b¹\u0001\u0010%J\"\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020y0\u00062\t\b\u0001\u0010º\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b»\u0001\u0010:J>\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020y0\u00062\u000b\b\u0003\u0010·\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0003\u0010¸\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0003\u0010¼\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0005\b½\u0001\u0010OJ4\u0010¿\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00140\u00062\u000f\b\u0001\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0005\b¿\u0001\u0010\u0012J.\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0005\bÁ\u0001\u0010.J\"\u0010Ã\u0001\u001a\t\u0012\u0005\u0012\u00030Â\u00010\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0005\bÃ\u0001\u0010:J\"\u0010Ä\u0001\u001a\t\u0012\u0005\u0012\u00030Â\u00010\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0005\bÄ\u0001\u0010:J\u0019\u0010Æ\u0001\u001a\t\u0012\u0005\u0012\u00030Å\u00010\u0006H'¢\u0006\u0006\bÆ\u0001\u0010\u008e\u0001J/\u0010É\u0001\u001a\t\u0012\u0005\u0012\u00030È\u00010\u00062\t\b\u0001\u0010Ç\u0001\u001a\u00020\u00022\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0005\bÉ\u0001\u0010.J:\u0010Ë\u0001\u001a\t\u0012\u0005\u0012\u00030È\u00010\u00062\t\b\u0001\u0010Ê\u0001\u001a\u00020\u00022\t\b\u0001\u0010Ç\u0001\u001a\u00020\u00022\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0005\bË\u0001\u0010OJ\"\u0010Ì\u0001\u001a\b\u0012\u0004\u0012\u00020K0\u00062\t\b\u0001\u0010Ê\u0001\u001a\u00020\u0002H'¢\u0006\u0005\bÌ\u0001\u0010:J=\u0010Ñ\u0001\u001a\t\u0012\u0005\u0012\u00030Ð\u00010\u00062\t\b\u0001\u0010Í\u0001\u001a\u00020\u00022\u000b\b\u0001\u0010Î\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0005\bÑ\u0001\u0010OJ)\u0010Ô\u0001\u001a\t\u0012\u0005\u0012\u00030Ó\u00010\u00062\u000f\b\u0001\u0010Ò\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0005\bÔ\u0001\u0010\u0012J:\u0010Ù\u0001\u001a\t\u0012\u0005\u0012\u00030Ø\u00010\u00062\t\b\u0001\u0010Õ\u0001\u001a\u00020\u00022\t\b\u0001\u0010Ö\u0001\u001a\u00020\u00022\t\b\u0001\u0010×\u0001\u001a\u00020\u0004H'¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001¨\u0006Ü\u0001"}, d2 = {"Lru/avito/messenger/MessengerApiService;", "", "", "methodName", "Lcom/avito/android/remote/model/RawJson;", "params", "Lio/reactivex/rxjava3/core/I;", "callMethod", "(Ljava/lang/String;Lcom/avito/android/remote/model/RawJson;)Lio/reactivex/rxjava3/core/I;", "", "Lcom/avito/android/remote/model/messenger/geo/GeoMarker;", "getGeoMarkers", "Lcom/avito/android/remote/model/messenger/context_actions/RecommendationsResponse;", "getRecommendations", "", "videoIds", "Lcom/avito/android/remote/model/messenger/video/VideosResponse;", "getVideos", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/I;", "voiceIds", "", "Lcom/avito/android/remote/model/messenger/voice/VoiceInfo;", "getVoiceInfos", "channelId", MessageBody.RANDOM_ID, "text", "templates", "quoteMessageId", "", "chunkIndex", "xHash", "", "initActionTimestamp", "Lru/avito/messenger/api/entity/ChatMessage;", "sendTextMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)Lio/reactivex/rxjava3/core/I;", "sendReactionMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "itemId", "sendItemMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "imageId", "sendImageMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/I;", "targetUserId", "sendCallMessage", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", ContextActionHandler.Link.URL, "sendLinkMessage", "", "latitude", "longitude", "title", MessageBody.Location.KIND, "sendLocationMessage", "(Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/I;", "Lru/avito/messenger/api/entity/CreateFileResponse;", "createFile", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "fileHash", "Lru/avito/messenger/api/entity/CreateVideoFileResponse;", "createVideoFile", "duration", "Lru/avito/messenger/api/entity/CreateVoiceFileResponse;", "createVoiceFile", "(Ljava/lang/String;J)Lio/reactivex/rxjava3/core/I;", "fileName", "contentType", "Lru/avito/messenger/api/entity/CreateChunkedVideoFileResponse;", "createChunkedVideoFile", MessageBody.Video.VIDEO_ID, "fileId", "uploadSessionId", "Lru/avito/messenger/api/entity/MultipartUploadPart;", "parts", "Lkotlin/G0;", "confirmChunkedUpload", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/reactivex/rxjava3/core/I;", "abortChunkedUpload", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", MessageBody.Voice.VOICE_ID, "sendVoiceMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/I;", "sendFileMessage", "sendVideoMessage", "Lru/avito/messenger/api/entity/GetFileResponse;", "getFile", "getVoiceFile", "offsetTimestamp", "limit", "filters", "Lru/avito/messenger/api/entity/ChannelsResponse;", "getChannels", "(Ljava/lang/Long;ILjava/util/Map;)Lio/reactivex/rxjava3/core/I;", "userIds", "Lru/avito/messenger/api/entity/GetUsersResponse;", "getUsers", "(Ljava/lang/String;Ljava/util/List;)Lio/reactivex/rxjava3/core/I;", "offset", "query", "Lru/avito/messenger/api/entity/ChannelsSearchResponse;", "searchChats", "(ILjava/lang/Integer;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lru/avito/messenger/api/entity/ChatMessagesResponse;", "latestMessages", "(Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/I;", "before", "after", "messagesBefore", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/I;", "messagesAfter", "(Ljava/lang/String;JLjava/lang/Integer;)Lio/reactivex/rxjava3/core/I;", "lastMessageTime", "", "markChannelAsRead", "channelIds", "markChannelsAsRead", "markChannelsAsUnread", "sendTyping", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lio/reactivex/rxjava3/core/I;", "clearHistory", "Lru/avito/messenger/api/entity/Channel;", "getChatById", "itemIds", "Lru/avito/messenger/api/entity/body/item/BodyItem;", "getBodyItems", "", "imageIds", "Lru/avito/messenger/api/entity/BodyImagesResponse;", "getBodyImages", "(Ljava/util/Collection;)Lio/reactivex/rxjava3/core/I;", "Lru/avito/messenger/api/entity/BlacklistUserRequest;", "users", "reasonId", "reasonText", "addToBlackList", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", ChannelContext.Item.USER_ID, "Lru/avito/messenger/api/entity/SuccessResponse;", "removeFromBlackList", "Lru/avito/messenger/api/entity/BlacklistReasons;", "getBlacklistReasons", "()Lio/reactivex/rxjava3/core/I;", PlatformActions.MESSAGE_ID, "confirmChatAsSpam", "confirmChatAsNonSpam", "Lru/avito/messenger/api/entity/GetLastActionTimesResponse;", "getUserLastActionTimes", "Lru/avito/messenger/api/entity/BlockedUsersResponse;", "getBlacklist", "(ILjava/lang/Integer;)Lio/reactivex/rxjava3/core/I;", "sendPing", "getReplySuggest", "options", "setOptions", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "Lru/avito/messenger/api/entity/ChannelsCounters;", "getChatCounters", "folders", "isEntryPointView", "Lru/avito/messenger/api/entity/FoldersCountersResponse;", "getFolderCounters", "(Ljava/util/Map;Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/I;", "q", "getItemsForAttach", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", "getGeoCodedLocationForCoordinates", "(DDLjava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/messenger/geo/GeoPoint;", "centerPoint", "Lcom/avito/android/remote/model/messenger/geo/GeoSearchSuggests;", "getGeoSearchSuggests", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/geo/GeoPoint;)Lio/reactivex/rxjava3/core/I;", "itemLocation", "getFavoritePlaces", "(Ljava/lang/String;Lcom/avito/android/remote/model/messenger/geo/GeoPoint;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/I;", "remoteId", "deleteMessage", "addTags", "removeTags", "updateFolderTags", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;)Lio/reactivex/rxjava3/core/I;", SearchParamsConverterKt.SOURCE, "extra", "createChat", "opponentId", "createChatByOpponentUser", "avitoUserId", "createChatWithAvito", "types", "getUnknownMessageBodies", "Lyk0/a;", "getPhoneByChannelId", "Lru/avito/messenger/api/entity/PinUnpinChannelResponse;", "pinChannel", "unpinChannel", "Lcom/avito/android/remote/model/messenger/quick_replies/QuickRepliesResponse;", "getQuickReplies", "message", "Lru/avito/messenger/api/entity/AddQuickReplyResponse;", "addQuickReply", "replyId", "editQuickReply", "deleteQuickReply", "channelID", "actualLastMessageId", "userInput", "Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggestsResponse;", "getSellerSuggests", LocalPublishState.FIELDS, "Lcom/avito/android/remote/model/messenger/get_settings/GetSettingsResponse;", "getSettings", "id", TooltipAttribute.PARAM_DEEP_LINK, "ops", "Lru/avito/messenger/MessengerApiService$b;", "addResponsePatch", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/RawJson;)Lio/reactivex/rxjava3/core/I;", "b", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface MessengerApiService {

    /* compiled from: MessengerApiService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: MessengerApiService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/MessengerApiService$b;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    @JsonRpcMethod("messenger.abortChunkedUpload.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> abortChunkedUpload(@Y61.k @JsonRpcParam(MessageBody.Video.VIDEO_ID) String videoId, @Y61.k @JsonRpcParam("fileId") String fileId, @Y61.k @JsonRpcParam("uploadSessionId") String uploadSessionId);

    @JsonRpcMethod("messenger.quickReplyAdd.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<AddQuickReplyResponse> addQuickReply(@Y61.k @JsonRpcParam("reply") String message, @Y61.l @JsonRpcParam("title") String title);

    @JsonRpcMethod("responsePatch.add.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<b> addResponsePatch(@Y61.k @JsonRpcParam("id") String id2, @Y61.k @JsonRpcParam(TooltipAttribute.PARAM_DEEP_LINK) String uri, @Y61.k @JsonRpcParam("ops") RawJson ops);

    @JsonRpcMethod("avito.blacklistAdd.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> addToBlackList(@Y61.k @JsonRpcParam("users") List<BlacklistUserRequest> users, @Y61.l @JsonRpcParam("reasonId") Long reasonId, @Y61.l @JsonRpcParam("reasonText") String reasonText);

    @Y61.k
    @JsonRpcMethodCall
    io.reactivex.rxjava3.core.I<RawJson> callMethod(@JsonRpcMethodName("methodName") @Y61.k String methodName, @JsonRpcBody @Y61.k RawJson params);

    @JsonRpcMethod("messenger.clearMessageHistoryMulti")
    @Y61.k
    io.reactivex.rxjava3.core.I<Boolean> clearHistory(@Y61.k @JsonRpcParam("channelIds") List<String> channelIds);

    @JsonRpcMethod("messenger.suspectCancel")
    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> confirmChatAsNonSpam(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.k @JsonRpcParam(PlatformActions.MESSAGE_ID) String messageId);

    @JsonRpcMethod("messenger.suspectConfirm")
    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> confirmChatAsSpam(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.k @JsonRpcParam(PlatformActions.MESSAGE_ID) String messageId);

    @JsonRpcMethod("messenger.confirmChunkedUpload.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> confirmChunkedUpload(@Y61.k @JsonRpcParam(MessageBody.Video.VIDEO_ID) String videoId, @Y61.k @JsonRpcParam("fileId") String fileId, @Y61.k @JsonRpcParam("uploadSessionId") String uploadSessionId, @Y61.k @JsonRpcParam("parts") List<MultipartUploadPart> parts);

    @JsonRpcMethod("avito.chatCreateByItemId.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> createChat(@Y61.k @JsonRpcParam("itemId") String itemId, @Y61.l @JsonRpcParam(SearchParamsConverterKt.SOURCE) String source, @Y61.l @JsonRpcParam("extra") String extra, @Y61.l @JsonRpcParam("xHash") String xHash);

    @JsonRpcMethod("messenger.chatCreateByUserId.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> createChatByOpponentUser(@Y61.k @JsonRpcParam("opponentId") String opponentId);

    @JsonRpcMethod("messenger.chatCreateByAvito.v3")
    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> createChatWithAvito(@Y61.l @JsonRpcParam(SearchParamsConverterKt.SOURCE) String source, @Y61.l @JsonRpcParam("extra") String extra, @Y61.l @JsonRpcParam("avitoUserId") String avitoUserId);

    @JsonRpcMethod("messenger.createChunkedVideo.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<CreateChunkedVideoFileResponse> createChunkedVideoFile(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.k @JsonRpcParam("fileName") String fileName, @Y61.k @JsonRpcParam("contentType") String contentType, @Y61.l @JsonRpcParam("fileHash") String fileHash);

    @JsonRpcMethod("messenger.createFile.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<CreateFileResponse> createFile(@Y61.k @JsonRpcParam("channelId") String channelId);

    @JsonRpcMethod("messenger.createVideo.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<CreateVideoFileResponse> createVideoFile(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.l @JsonRpcParam("fileHash") String fileHash);

    @JsonRpcMethod("messenger.createVoiceFile")
    @Y61.k
    io.reactivex.rxjava3.core.I<CreateVoiceFileResponse> createVoiceFile(@Y61.k @JsonRpcParam("channelId") String channelId, @JsonRpcParam("duration") long duration);

    @JsonRpcMethod("messenger.deleteMessage.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> deleteMessage(@Y61.k @JsonRpcParam(PlatformActions.MESSAGE_ID) String remoteId, @Y61.k @JsonRpcParam("channelId") String channelId);

    @JsonRpcMethod("messenger.quickReplyDelete.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> deleteQuickReply(@Y61.k @JsonRpcParam("id") String replyId);

    @JsonRpcMethod("messenger.quickReplyChange.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<AddQuickReplyResponse> editQuickReply(@Y61.k @JsonRpcParam("id") String replyId, @Y61.k @JsonRpcParam("reply") String message, @Y61.l @JsonRpcParam("title") String title);

    @JsonRpcMethod("avito.getBlacklist.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<BlockedUsersResponse> getBlacklist(@JsonRpcParam("offset") int offset, @Y61.l @JsonRpcParam("limit") Integer limit);

    @JsonRpcMethod("messenger.getBlacklistReasons")
    @Y61.k
    io.reactivex.rxjava3.core.I<BlacklistReasons> getBlacklistReasons();

    @JsonRpcMethod("avito.getBodyImages")
    @Y61.k
    io.reactivex.rxjava3.core.I<BodyImagesResponse> getBodyImages(@Y61.k @JsonRpcParam("ids") Collection<String> imageIds);

    @JsonRpcMethod("avito.getBodyItems.v3")
    @Y61.k
    io.reactivex.rxjava3.core.I<List<BodyItem>> getBodyItems(@Y61.k @JsonRpcParam("ids") List<String> itemIds);

    @JsonRpcMethod("avito.getChats.v5")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChannelsResponse> getChannels(@Y61.l @JsonRpcParam("offsetTimestamp") Long offsetTimestamp, @JsonRpcParam("limit") int limit, @Y61.k @JsonRpcParam("filters") Map<String, ? extends Object> filters);

    @JsonRpcMethod("avito.getChatById.v3")
    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> getChatById(@Y61.k @JsonRpcParam("channelId") String channelId);

    @JsonRpcMethod("messenger.getUnreadCount.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChannelsCounters> getChatCounters();

    @JsonRpcMethod("messenger.favoritePlaces.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<GeoSearchSuggests> getFavoritePlaces(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.l @JsonRpcParam("itemLocation") GeoPoint itemLocation, @Y61.l @JsonRpcParam("limit") Integer limit);

    @JsonRpcMethod("messenger.getFile.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<GetFileResponse> getFile(@Y61.k @JsonRpcParam("fileId") String fileId);

    @JsonRpcMethod("messenger.getUnreadCount.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<FoldersCountersResponse> getFolderCounters(@Y61.k @JsonRpcParam("folders") Map<String, ? extends Collection<String>> folders, @Y61.l @JsonRpcParam("isEntryPointView") Boolean isEntryPointView);

    @JsonRpcMethod("messenger.reverseGeo.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<MessageBody.Location> getGeoCodedLocationForCoordinates(@JsonRpcParam("lat") double latitude, @JsonRpcParam(MessageBody.Location.LONGITUDE) double longitude, @Y61.k @JsonRpcParam(MessageBody.Location.KIND) String kind);

    @Y61.k
    @JsonRpcMethodCall
    io.reactivex.rxjava3.core.I<GeoMarker[]> getGeoMarkers(@JsonRpcMethodName("methodName") @Y61.k String methodName, @JsonRpcBody @Y61.k RawJson params);

    @JsonRpcMethod("messenger.geoSearch.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<GeoSearchSuggests> getGeoSearchSuggests(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.k @JsonRpcParam("query") String query, @Y61.l @JsonRpcParam("centerPoint") GeoPoint centerPoint);

    @JsonRpcMethod("avito.getItemsForAttach.v3")
    @Y61.k
    io.reactivex.rxjava3.core.I<List<BodyItem>> getItemsForAttach(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.l @JsonRpcParam("itemId") Long itemId, @Y61.l @JsonRpcParam("limit") Integer limit, @Y61.l @JsonRpcParam("offset") Integer offset, @Y61.k @JsonRpcParam("q") String q12);

    @JsonRpcMethod("messenger.getPhoneByChannelId.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<C50261a> getPhoneByChannelId(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.l @JsonRpcParam("xHash") String xHash);

    @JsonRpcMethod("messenger.quickReplies.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<QuickRepliesResponse> getQuickReplies();

    @Y61.k
    @JsonRpcMethodCall
    io.reactivex.rxjava3.core.I<RecommendationsResponse> getRecommendations(@JsonRpcMethodName("methodName") @Y61.k String methodName, @JsonRpcBody @Y61.k RawJson params);

    @JsonRpcMethod("suggest.getReplySuggest")
    @Y61.k
    io.reactivex.rxjava3.core.I<Map<String, List<String>>> getReplySuggest(@Y61.k @JsonRpcParam("channelIds") List<String> channelIds);

    @JsonRpcMethod("suggest.getMessages")
    @Y61.k
    io.reactivex.rxjava3.core.I<MessageSuggestsResponse> getSellerSuggests(@Y61.k @JsonRpcParam("channelId") String channelID, @Y61.l @JsonRpcParam("actualLastMessageId") String actualLastMessageId, @Y61.l @JsonRpcParam("userInput") String userInput);

    @JsonRpcMethod("messenger.getSettings.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<GetSettingsResponse> getSettings(@Y61.k @JsonRpcParam(LocalPublishState.FIELDS) List<String> fields);

    @JsonRpcMethod("avito.getMessageBodyUnknown")
    @Y61.k
    io.reactivex.rxjava3.core.I<Map<String, String>> getUnknownMessageBodies(@Y61.k @JsonRpcParam("messageTypes") List<String> types);

    @JsonRpcMethod("messenger.getLastActionTimes.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<GetLastActionTimesResponse> getUserLastActionTimes(@Y61.k @JsonRpcParam("userIds") List<String> userIds);

    @JsonRpcMethod("messenger.getUsers.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<GetUsersResponse> getUsers(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.k @JsonRpcParam("userIds") List<String> userIds);

    @JsonRpcMethod("messenger.getVideos.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<VideosResponse> getVideos(@Y61.k @JsonRpcParam("videoIds") List<String> videoIds);

    @JsonRpcMethod("messenger.getVoiceFile")
    @Y61.k
    io.reactivex.rxjava3.core.I<Map<String, GetFileResponse>> getVoiceFile(@Y61.k @JsonRpcParam(MessageBody.Voice.VOICE_ID) List<String> voiceIds);

    @JsonRpcMethod("messenger.getVoiceInfo")
    @Y61.k
    io.reactivex.rxjava3.core.I<Map<String, VoiceInfo>> getVoiceInfos(@Y61.k @JsonRpcParam(MessageBody.Voice.VOICE_ID) List<String> voiceIds);

    @JsonRpcMethod("messenger.history.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessagesResponse> latestMessages(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.l @JsonRpcParam("limit") Integer limit);

    @JsonRpcMethod("messenger.readChat")
    @Y61.k
    io.reactivex.rxjava3.core.I<Boolean> markChannelAsRead(@Y61.k @JsonRpcParam("channelId") String channelId, @JsonRpcParam("lastMessageTime") long lastMessageTime);

    @JsonRpcMethod("messenger.readChats.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<Boolean> markChannelsAsRead(@Y61.k @JsonRpcParam("channelIds") List<String> channelIds);

    @JsonRpcMethod("messenger.unreadChats.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<Boolean> markChannelsAsUnread(@Y61.k @JsonRpcParam("channelIds") List<String> channelIds);

    @JsonRpcMethod("messenger.history.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessagesResponse> messagesAfter(@Y61.k @JsonRpcParam("channelId") String channelId, @JsonRpcParam("after") long after, @Y61.l @JsonRpcParam("limit") Integer limit);

    @JsonRpcMethod("messenger.history.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessagesResponse> messagesBefore(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.l @JsonRpcParam("before") Long before, @Y61.l @JsonRpcParam("after") Long after, @Y61.l @JsonRpcParam("limit") Integer limit);

    @JsonRpcMethod("messenger.pinChannel")
    @Y61.k
    io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> pinChannel(@Y61.k @JsonRpcParam("channelId") String channelId);

    @JsonRpcMethod("avito.blacklistRemove.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<SuccessResponse> removeFromBlackList(@Y61.k @JsonRpcParam(ChannelContext.Item.USER_ID) String userId);

    @JsonRpcMethod("messenger.search.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChannelsSearchResponse> searchChats(@JsonRpcParam("offset") int offset, @Y61.l @JsonRpcParam("limit") Integer limit, @Y61.k @JsonRpcParam("query") String query);

    @JsonRpcMethod("avito.sendMissedCallMessage.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendCallMessage(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.k @JsonRpcParam("targetUserId") String targetUserId);

    @JsonRpcMethod("messenger.sendFile.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendFileMessage(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.k @JsonRpcParam("fileId") String fileId, @Y61.l @JsonRpcParam(MessageBody.RANDOM_ID) String randomId, @Y61.l @JsonRpcParam("quoteMessageId") String quoteMessageId, @Y61.l @JsonRpcParam("chunkIndex") Integer chunkIndex);

    @JsonRpcMethod("avito.sendImageMessage.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendImageMessage(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.l @JsonRpcParam(MessageBody.RANDOM_ID) String randomId, @Y61.k @JsonRpcParam("imageId") String imageId, @Y61.l @JsonRpcParam("quoteMessageId") String quoteMessageId, @Y61.l @JsonRpcParam("chunkIndex") Integer chunkIndex);

    @JsonRpcMethod("avito.sendItemMessage.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendItemMessage(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.l @JsonRpcParam(MessageBody.RANDOM_ID) String randomId, @Y61.k @JsonRpcParam("itemId") String itemId, @Y61.l @JsonRpcParam("quoteMessageId") String quoteMessageId, @Y61.l @JsonRpcParam("chunkIndex") Integer chunkIndex, @Y61.l @JsonRpcParam("xHash") String xHash);

    @JsonRpcMethod("messenger.sendLinkMessage.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendLinkMessage(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.k @JsonRpcParam(ContextActionHandler.Link.URL) String url, @Y61.l @JsonRpcParam(MessageBody.RANDOM_ID) String randomId, @Y61.l @JsonRpcParam("quoteMessageId") String quoteMessageId, @Y61.l @JsonRpcParam("chunkIndex") Integer chunkIndex);

    @JsonRpcMethod("messenger.sendLocationMessage.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendLocationMessage(@Y61.k @JsonRpcParam("channelId") String channelId, @JsonRpcParam("lat") double latitude, @JsonRpcParam(MessageBody.Location.LONGITUDE) double longitude, @Y61.k @JsonRpcParam("title") String title, @Y61.l @JsonRpcParam(MessageBody.Location.KIND) String kind, @Y61.l @JsonRpcParam(MessageBody.RANDOM_ID) String randomId, @Y61.l @JsonRpcParam("quoteMessageId") String quoteMessageId, @Y61.l @JsonRpcParam("chunkIndex") Integer chunkIndex);

    @JsonRpcMethod("ping")
    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> sendPing();

    @JsonRpcMethod("messenger.sendReactionMessage.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendReactionMessage(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.l @JsonRpcParam(MessageBody.RANDOM_ID) String randomId, @Y61.k @JsonRpcParam("text") String text, @Y61.l @JsonRpcParam("xHash") String xHash);

    @JsonRpcMethod("avito.sendTextMessage.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendTextMessage(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.l @JsonRpcParam(MessageBody.RANDOM_ID) String randomId, @Y61.k @JsonRpcParam("text") String text, @Y61.l @JsonRpcParam("templates") List<String> templates, @Y61.l @JsonRpcParam("quoteMessageId") String quoteMessageId, @Y61.l @JsonRpcParam("chunkIndex") Integer chunkIndex, @Y61.l @JsonRpcParam("xHash") String xHash, @Y61.l @JsonRpcParam("initActionTimestamp") Long initActionTimestamp);

    @JsonRpcMethod("messenger.sendTyping.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> sendTyping(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.k @JsonRpcParam("userIds") List<String> userIds, @Y61.l @JsonRpcParam("initActionTimestamp") Long initActionTimestamp);

    @JsonRpcMethod("messenger.sendVideo.v2")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendVideoMessage(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.k @JsonRpcParam("fileId") String fileId, @Y61.k @JsonRpcParam(MessageBody.Video.VIDEO_ID) String videoId, @Y61.l @JsonRpcParam(MessageBody.RANDOM_ID) String randomId, @Y61.l @JsonRpcParam("quoteMessageId") String quoteMessageId, @Y61.l @JsonRpcParam("chunkIndex") Integer chunkIndex);

    @JsonRpcMethod("messenger.sendVoice")
    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendVoiceMessage(@Y61.k @JsonRpcParam("channelId") String channelId, @Y61.k @JsonRpcParam("fileId") String fileId, @Y61.k @JsonRpcParam(MessageBody.Voice.VOICE_ID) String voiceId, @Y61.l @JsonRpcParam(MessageBody.RANDOM_ID) String randomId, @Y61.l @JsonRpcParam("quoteMessageId") String quoteMessageId, @Y61.l @JsonRpcParam("chunkIndex") Integer chunkIndex);

    @JsonRpcMethod("messenger.setOptions")
    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> setOptions(@JsonRpcParamsMap @Y61.k Map<String, ? extends Object> options);

    @JsonRpcMethod("messenger.unpinChannel")
    @Y61.k
    io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> unpinChannel(@Y61.k @JsonRpcParam("channelId") String channelId);

    @JsonRpcMethod("messenger.updateFolderTags.v1")
    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> updateFolderTags(@Y61.k @JsonRpcParam("channelIds") Collection<String> channelIds, @Y61.k @JsonRpcParam("addTags") Collection<String> addTags, @Y61.k @JsonRpcParam("removeTags") Collection<String> removeTags);
}
